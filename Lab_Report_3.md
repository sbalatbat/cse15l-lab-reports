# Week 4 & 5 Lab Report

## Researching Commands: `find`

**What does `find` do?**
`find` "finds" files by recursively listing every folder and file in the given path's directory. The default directory is the working directory, and `find` outputs the path of files relative to the given path.

__Command-line options__
* `-type`
* `-name`
* `-print`
* `-delete`

### `-type`

`-type` filters the files and folders found by `find` by the given argument, such as `f` for files and `d` for directories.

Example 1
```
$ # working directory is written_2/non_fiction/OUP/Abernathy
$ find -type f
./ch1.txt
./ch14.txt
./ch15.txt
./ch2.txt
./ch3.txt
./ch6.txt
./ch7.txt
./ch8.txt
./ch9.txt
```

Example 2
```
$ # working directory is written_2/
$ find travel_guides/ -type d
travel_guides/
travel_guides/berlitz1
travel_guides/berlitz2
```

Sources
* ["Bash's find command" by math2001](https://math2001.github.io/article/bashs-find-command/)

### `-name`

`-name` filters the files and folders found by `find` by the given glob (pattern) argument, such as `"*.txt"` or `"*Japan.txt"`.

Example 1
```
$ # working directory is written_2/non-fiction/OUP/Kauffman
$ find -name "*.txt"
./ch1.txt
./ch10.txt
./ch3.txt
./ch4.txt
./ch5.txt
./ch6.txt
./ch7.txt
./ch8.txt
./ch9.txt
```

Example 2
```
$ # working directory is written_2/travel_guides/berlitz1
$ find -name "*Japan.txt"
./HistoryJapan.txt
./IntroJapan.txt
./WhatToJapan.txt
./WhereToJapan.txt
```

Sources
* ["Bash's find command" by math2001](https://math2001.github.io/article/bashs-find-command/)

### `-print`

`-print` is an action which, as you would expect, prints out the filenames. It is the default action of `find`.

Example 1
```
$ # working directory is written_2/travel_guides/berlitz1
$ find -name "*Madrid.txt" -print
./HandRMadrid.txt
./HistoryMadrid.txt
./IntroMadrid.txt
./WhereToMadrid.txt
```

Example 2
```
$ # working directory is written_2/travel_guides/berlitz1
$ find -name "History*.txt" -print
./HistoryDublin.txt
./HistoryEdinburgh.txt
./HistoryEgypt.txt
./HistoryFrance.txt
./HistoryFWI.txt
./HistoryGreek.txt
./HistoryHawaii.txt
./HistoryHongKong.txt
./HistoryIbiza.txt
./HistoryIndia.txt
./HistoryIsrael.txt
./HistoryIstanbul.txt
./HistoryItaly.txt
./HistoryJamaica.txt
./HistoryJapan.txt
./HistoryJerusalem.txt
./HistoryLakeDistrict.txt
./HistoryLasVegas.txt
./HistoryMadeira.txt
./HistoryMadrid.txt
./HistoryMalaysia.txt
./HistoryMallorca.txt
```

Sources
* ["Bash's find command" by math2001](https://math2001.github.io/article/bashs-find-command/)

### `-delete`

`delete` deletes files *permanently*. Recommended to use `find` without `-delete` first to check which files are going to be deleted. `STOPPED HERE: tired`

Example 1
```
$ find -option4 command
output
```

Example 2
```
$ find -option4 command
output
```

Sources
* ["Bash's find command" by math2001](https://math2001.github.io/article/bashs-find-command/)