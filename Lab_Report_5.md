# Lab Report 5: Week 8 & 9
*I really enjoyed learning about `find` and its options on [Lab Report 3](https://sbalatbat.github.io/cse15l-lab-reports/Lab_Report_3.html) so I will apply the same procedure to `grep`. I originally also wanted to write about the `--color` option for `grep` but I can't represent it in color with the code blocks.*

## Researching Commands: `grep`

**What does `grep` do?**
`grep` searches input files for matches to the given pattern(s). It copies the line containing a match into standard output by default, or produces other output based on specified options.

__Command-line options__
* `-e`
* `-n`
* `-o`
* `-r`

### `-e`

`-e` is the flag for the pattern that the user wants to match again. Using `-e` before every pattern that the user wants to search for allows for `grep` to search for multiple patterns. This is useful for searching for multiple strings at once, which may be applied in situations like looking for keywords in an applicant's resumé.

Example 1
```
$ # working directory written_2/travel_guides/berlitz1
$ grep -e "sea" -e "Fujiwara" -e "blossoms" HistoryJapan.txt
        Fujiwara clan, which was to rule Japanese affairs for hundreds of years
        and then engineering timely abdications, a Fujiwara contrived always to
        the emperor was only a minor, so that the Fujiwara patriarch acted as
        Very few emperors were reluctant to submit to Fujiwara
        and scholarship. The Fujiwara resented the Buddhist clergy’s great and
        birds, insects, flowers, roots, or seashells. Literary party games held
        first spring cherry blossoms, and special pavilions were built to watch
        After rival Fujiwara factions had been struggling for years
        western Honshu and Kyushu, at the titanic sea battle of
        the Fujiwara had done with the emperor. The fiction of Japanese
        Kyoto — still seconded by a Fujiwara regent at court — legitimized a
        attempt to travel abroad, and Japanese citizens already overseas were
$ # each line is a search result containing one of the patterns searched
```
In example 1, `-e` is used before each of the 3 patterns to tell `grep` that each of them are being searched for. This may be useful when looking for connected concepts that you're trying to find in a file.

Example 2
```
$ # working directory written_2/non-ficion/OUP/Abernathy
$ grep -e "1940s" -e "trade agreements" ch1.txt
In the late 1940s, Bond Stores, the largest men’s clothing chain at the time, created a sensation in New York City by offering a wide selection of suits with two pairs of pants instead of one, reintroducing a level of product choice not seen since before the war.1 When the line of 
hopeful buyers at its Times Square store stretched around the block, Bond had to impose a limit of two suits per customer. During World War II, the apparel and textile industries had been converted to supply field jackets, overcoats, and uniforms to the U.S. and Allied Forces. But 
in the years immediately following the war, returning soldiers, the end of rationing, and pent-up customer demand meant apparel was in short 
supply.
When it comes to international trade agreements, the conventional wisdom sounds most bleak. It leads to stark conclusions about the long-term viability of the U.S. apparel industry, even with steps taken to improve assembly-room productivity and fashion-oriented quick response. The following comment is typical:
```
In example 2, `-e` is used to flag 2 patterns in a very lengthy text. `grep` searches for both of these patterns and outputs the following, which is unbelievably long for being only two lines, but the usefulness here is that the 2nd pattern is a phrase rather than just one word, which lets the user be more specific in their searches combined with multiple patterns.

Sources
* [`grep` Manual Page](https://www.gnu.org/software/grep/manual/grep.html)
* [`-e` vs `-E`](https://unix.stackexchange.com/a/50514)
* [`grep -e` allows for several strings for searching](https://unix.stackexchange.com/a/74812)

### `-n`

`-n` adds line numbers matching the search results to the output of `grep`. This is useful when looking through a big document and knowing where exactly the results are within that file.

Example 1
```
$ # working directory written_2/non-ficion/OUP/Abernathy
$ # using -n to show line numbers of the results from example 2 of -e
$ grep -n -e "1940s" -e "trade agreements" ch1.txt
5:In the late 1940s, Bond Stores, the largest men’s clothing chain at the time, created a sensation in New York City by offering a wide selection of suits with two pairs of pants instead of one, reintroducing a level of product choice not seen since before the war.1 When the line of hopeful buyers at its Times Square store stretched around the block, Bond had to impose a limit of two suits per customer. During World War II, the apparel and textile industries had been converted to supply field jackets, overcoats, and uniforms to the U.S. and Allied Forces. But in the years immediately following the war, returning soldiers, the end of rationing, and pent-up customer demand meant apparel was in short supply.
61:When it comes to international trade agreements, the conventional wisdom sounds most bleak. It leads to stark conclusions about the long-term viability of the U.S. apparel industry, even with steps taken to improve assembly-room productivity and fashion-oriented quick response. 
The following comment is typical:
```
In example 1, `-e`'s example 2 is executed again, but with line numbers in the output this time. Using `-n` makes it easier to see that there are only 2 results, and where we can find them in the document.

Example 2
```
$ # working directory written_2/non-ficion/OUP/Abernathy
$ grep -n "1789" ch2.txt
6:Slater was interested in the financial rewards to be had in the new world while still in England. Mindful of British prohibitions, he committed to memory the design and construction of the spinning mill where he worked. Arriving in New York in late 1789, he was referred to Moses 
Brown in Providence, a prominent merchant who had established a company, Almy and Brown, to develop “frame or water spinning.” Brown responded on December 10, 1789, to Slater’s initial inquiry, saying Almy and Brown certainly wanted the assistance of a person with Slater’s skills because an experimental mill had failed, “no persons being acquainted with the business, and the frames imperfect.”2
8:The Slater mill not only copied British technology but recreated that country’s arrangement of family labor, which included young children, six-day weeks, the minimum twelve-hour day, Sabbath schools, and payment of wages partly in goods and partly in cash. The form of ownership 
and management also followed British lines—one partner financed the venture, while the other furnished the technical know-how. For these accomplishments, Samuel Slater has been called “the father of American manufactures.” His story underscores the international role of textiles and apparel, their impetus in national economic development, and their place in conflicts over domestic production and imports—a theme that recurs throughout U.S. history. For example, from the outset of the new nation, President George Washington and his Secretary of the Treasury Alexander Hamilton wanted to encourage U.S.-based industry. Indeed, Washington wore a dark brown suit, entirely made in America, for his first 
inaugural on April 30, 1789.3
```
In example 2, using `-n` with this search again puts the line number before the matching lines. Again, makes it easier to figure out where they are within the document.

Sources
* [`grep` Manual page](https://www.gnu.org/software/grep/manual/grep.html)

### `-o`

`-o` only prints the exact match of the pattern searched, rather than the default matching line.

Example 1
```
$ # using -o on example 2 of -n
$ # working directory written_2/non-ficion/OUP/Abernathy
$ grep -n -o "1789" ch2.txt
6:1789
6:1789
8:1789
```
In example 1, `-o` prints out only the exact matches from `-n`'s example 2. Combined with `-n`, `-o` allows us to see much more easily that there are 3 matches of the pattern "1789", and that 2 of them are on the same line, which is not as easy to notice from having the default matching line output.

Example 2
```
$ # using -o in a pipe with wc
$ # working directory written_2/non-ficion/OUP/Abernathy
$ grep -o "retail" ch3.txt | wc -l
113
```
In example 2, `grep -o ch3.txt` prints out the exact matches of the pattern all separated by new lines, and piping it into `wc -l` gives us the number of instances of that pattern in the file. This is useful for counting how many times a pattern appears in a specific file.

Sources
* [`grep` Manual page](https://www.gnu.org/software/grep/manual/grep.html)
* [How to Count Word Occurrences in a Text File](https://www.tecmint.com/count-word-occurrences-in-linux-text-file/)

### `-r`

`-r` recursively looks through every file in each given directory for the provided pattern. `grep` searches the working directory if there are no file operands given.

Example 1
```
$ # working directory written_2/non-ficion/OUP/Abernathy
$ grep -r "trade agreements"
ch1.txt:When it comes to international trade agreements, the conventional wisdom sounds most bleak. It leads to stark conclusions about the long-term viability of the U.S. apparel industry, even with steps taken to improve assembly-room productivity and fashion-oriented quick response. The following comment is typical:
ch2.txt:The combined impact of these factors is captured by the following trends. From 1950 to 1996, U.S. production of textiles increased almost threefold. Over the same time period, the number of production workers decreased by almost half. And the rate of textile productivity over this period far outpaced that for the manufacturing sector as a whole. (We discuss the performance of the textile industry extensively in 
Chapter 13.) Although U.S. apparel firms struggled in the 1980s, competing with foreign producers on labor costs, the domestic textile industry fared much better. Successful exploitation of economies of scale, favorable international trade agreements such as the MFA, and special arrangements for apparel imports made of U.S. textiles—even the clout of certain southern senators, looking after the firms in their states—mean the U.S. textile story has not been determined by import penetration.
```
Example 1 here uses `grep -r` without a file operand, causing `grep` to look through the working directory by default. The command outputs the matching lines and in which file they are from, which is useful when you remember a pattern appearing somewhere but not necessarily in which file.

Example 2
```
$ # working directory written_2
$ grep -r "Manitoba Act" travel_guides/
travel_guides/berlitz2/Canada-History.txt:Only the promise of a transcontinental railway brought Nova Scotia immediately into the Confederation, with British Columbia joining in 1871, and Prince Edward Island in 1873. Rupert’s Land was bought from the H.B.C. in 1869, but incorporating Manitoba was not so easy. Led by Louis Riel, Métis descendants of Indians and French fur traders waged an armed struggle for land rights 
on the Red River in the face of the expansion-hungry railway builders. An impassioned politician as well as a fiery military leader, Riel won local Anglo-Saxon support for his proposed Manitoba Act guaranteeing equal French and English language rights in school and church. But the 
execution of a troublemaker from Toronto brought in a retaliatory force of Ontario troops, and Riel fled to the United States. The Métis were driven off their fertile land and back to hunting on the plains.
```
Example 2 shows `grep` recursively searching through `travel_guides` which has 2 directories within it, `berlitz1` and `berlitz2`. This is useful for searching through directories rather than manually searching possibly enormous files for certain patterns.

Sources
* [`grep` Manual page](https://www.gnu.org/software/grep/manual/grep.html)
* [Grep Command in Linux Explained with Practical Examples](https://www.computernetworkingnotes.com/linux-tutorials/grep-command-in-linux-explained-with-practical-examples.html#:~:text=The%20grep%20command%20supports%20recursive,files%20of%20the%20specified%20directory.)
