# Week 6 and 7 Lab Report

## CSE Labs "Done Quick"

### Log into ieng6

![ieng6 login](./Lab_Report_4_files/Screenshot%202023-02-24%20lr44.jpg)

*Keys pressed:*
ssh cs15lw `<tab>` `<enter>`


*Command & Key Press Summary:*
I typed in  ssh to log into the server and typed the first couple characters of my ieng6 account username, then pressed `<tab>` for autocomplete, and `<enter>` to log in. Since I already have the ssh key, I don't need to type in my password.

### Clone your fork of the repository from your GitHub account

![clone fork](./Lab_Report_4_files/Screenshot%202023-02-24%20lr45.jpg)

*Keys pressed:*

`<ctrl><c>`

git clone `<ctrl><v>` `<enter>`

ls `<enter>`


*Command & Key Press Summary:*

I copied the ssh link of the fork using `<ctrl><c>`. Then I typed in git clone for the repo clone command. `<ctrl><v>` pasted the link I copied. Then I pressed `<enter>` and the fork was cloned into the home directory of my ieng6 account. I typed ls and pressed `<enter>` to demonstrate that the repo got forked.

### Run the tests, demonstrating that they fail

![run failing tests](./Lab_Report_4_files/Screenshot%202023-02-24%20lr46.jpg)

*Keys pressed:*

cd l`<tab>` `<enter>`

ls `<enter>`

`<ctrl><c>`

`<ctrl><v>` `enter`

ls `<enter>`

`<ctrl><c>`

`<ctrl><v>` `<space>` L`<tab>`T`<tab>` `<backspace>` `<enter>`


*Command & Key Press Summary:*

Using cd, I went into the lab7 directory that I just made. I pressed `<tab>` after typing l for the autocomplete. I used ls tot demonstrate I got into the directory. I copied the JUnit compile command from the week 3 website using `<ctrl><c>`, then `<ctrl><v>` pasted the command into the terminal. I pressed enter, and the command compiled all the java files in the lab7 directory. I copied the JUnit run command from the week 3 website using `<ctrl><c>`, then pasted it to the terminal with `<ctrl><v>`. I pressed `<space>` to get to typing the argument. I pressed L then `<tab>` and the argument autocompleted to "ListExamples". I pressed T then `<tab>` and the argument autocompleted to "ListExamples.". I pressed `<backspace>` to remove the period and `<enter>` to run the command, which ran the JUnit tests.

### Edit the code file to fix the failing test

![finished edit on nano](./Lab_Report_4_files/Screenshot%202023-02-24%20lr47a.jpg)
![terminal after nano exit](./Lab_Report_4_files/Screenshot%202023-02-24%20lr47b.jpg)

*Keys pressed:*

nano L`<tab>`.j`<tab>` `<enter>`

`<ctrl><w>` index1 `<enter>`

`<down>``<down>``<down>``<down>``<down>``<down>``<down>``<down>``<down>``<down>``<down>``<down>``<down>``<down>``<down>``<down>``<down>``<right>``<right>``<right>``<right>``<backspace>` 2

`<ctrl><o>``<enter>`

`<ctrl><x>`


*Command & Key Press Summary:*

The command nano opens the nano text editor which takes over the terminal. I typed L`<tab>` for the argument to autocomplete to "ListExamples" then .j`<tab>` to autocomplete to "ListExamples.java" then `<enter>` for the command to run. I pressed `<ctrl><w>` for the nano Where Is command then typed index1 `<enter>` to find the variable I was looking to change. I pressed `<down>` 17 times to get to the actual line I needed, then `<right>` 4 times to get to the spot right after the "1" in index1. I pressed `<backspace>` then 2 to fix the variable. I pressed `<ctrl><o>` for the overwrite command then pressed `<enter>` so the file name won't change. Then I pressed `<ctrl><x>` to exit the editor.

### Run  the tests, demonstrating that they now succeed

![run succeeding tests](./Lab_Report_4_files/Screenshot%202023-02-24%20lr48.jpg)

*Keys pressed:*

`<up>``<up>``<up>``<up>``<enter>`

`<up>``<up>``<up>``<enter>`


*Command & Key Press Summary:*

I pressed `<up>` 4 times because the JUnit compile command is 4 up in my history, then pressed `<enter>` to compile all the files in the lab7 directory. Then I pressed `<up>` 3 times because the JUnit run command is 3 up in my history, then pressed `<enter>` to run the tests, which succeed.

### Commit and push the resulting change to your GitHub account (you can pick any commit message!)

![commit changes](./Lab_Report_4_files/Screenshot%202023-02-24%20lr49.jpg)

*Keys pressed:*

git add L`<tab>`.j`<tab>` `<enter>`

git status `<enter>`

git commit -m "Updated ListExamples.java" `<enter>`


*Command & Key Press Summary:*

I typed the git add command to add the files I wanted to commit to the repo. I typed L`<tab>` so the argument autocompletes to "ListExamples" then .j`<tab>` so it'll autocomplete to "ListExamples.java", then pressed `<enter>` to run the command. I typed the git status command then `<enter>` to see if the add worked properly. Then I typed the entire git commit -m command. The -m option lets me put a commit message, and the commit message I put is "Updated ListExamples.java". Then I pressed `<enter>` for the command to run and commit my changes.