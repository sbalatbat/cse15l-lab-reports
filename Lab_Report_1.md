# Week 1 Lab Report

## How to Log Into a Course-Specific Account on `ieng6`
This tutorial is done on Windows so there may be minor differences, such as keyboard shortcuts and visuals.

### Your CSE15L Account

1. Look up your course-specific account for CSE15L on the following link https://sdacs.ucsd.edu/~icc/index.php

2. Next, reset your password by following this the tutorial:
   [How to Reset your Password](https://docs.google.com/document/d/1hs7CyQeh-MdUfM9uv99i8tqfneos6Y8bDU0uhn1wqho/edit)

3. Do the rest of the steps while waiting for the new password to take effect.

   Note that although the password reset was supposed to only change the password for the course-specific account, it's likely that the password will get changed globally on the system (as it happened to me and my labmates). This means that the new password will be used for all associated UCSD accounts. I'm not sure what fix is there aside from simply changing it back later.

### Installing VSCode
1. Go to the Visual Studio Code website https://code.visualstudio.com/

![VS Code Website Home](https://github.com/sbalatbat/cse15l-lab-reports/blob/main/Screenshot%20(338).png)

2. Follow the instructions to download and install it on your computer.  There are versions for the major operating systems, like OSX for Macs and Windows for PCs.

![VS Code Download Screen](https://github.com/sbalatbat/cse15l-lab-reports/blob/main/Screenshot%20(339).png)

3. You should be able to open a window that looks like this (with colors or menu bars possibly looking different depending on your system and settings). I already had VS Code installed so I simply opened the program.

![VS Code Home](https://github.com/sbalatbat/cse15l-lab-reports/blob/main/Screenshot%20(340).png)

4. Now you're ready for the next part :)

### Remotely Connecting

1. If you're on Windows, the first thing you need to do is install `git` for Windows. Follow the steps for installation on the linked site. [Git for Windows](https://gitforwindows.org/)

2. Next, set the default terminal to use the newly-installed `git bash` in VS Code.
   * Open VS Code and press Ctrl + Shift + \` to open the terminal, or click Terminal on the menu bar and click New Terminal.
     
     ![Open New Terminal](https://github.com/sbalatbat/cse15l-lab-reports/blob/main/Screenshot%20(341).png)
   * Open the command palette using Ctrl + Shift + P
   * Type "Select Default Profile" and click the option that shows up.
     
     ![Select Default Profile](https://github.com/sbalatbat/cse15l-lab-reports/blob/main/Screenshot%202023-01-14%20183700.jpg)
   * Select Git Bash from the options.
   
     ![Select Git Bash](https://github.com/sbalatbat/cse15l-lab-reports/blob/main/Screenshot%202023-01-14%20184946.jpg)
   * Click on the + icon in the terminal window. This will create a new bash terminal, as you can see on the sidebar.
     
     ![New Bash Terminal](https://github.com/sbalatbat/cse15l-lab-reports/blob/main/Screenshot%202023-01-14%20185714.jpg)
3. Type in the following command into the terminal, but replace `zz` with the letters in your course-specific account.

   ```$ ssh cs15lwi23zz@ieng6.ucsd.edu```

   To clarify, that is one, five, and lowercase L after cs, and `$` is there for command writing convention, aka you don't have to type it into the terminal. You will be prompted `Are you sure you want to continue connecting?` after pressing enter.

4. Type `yes` and press enter, then give your password into the terminal. Your password will not appear in the terminal as you type. The terminal should output something like this:

   ![Successful Login Output](https://github.com/sbalatbat/cse15l-lab-reports/blob/main/Screenshot%20(After%20Command).png)

5. You are now connected to a computer in the CSE basement, which runs any command you run. Your computer is called the *client* and the one in the basement is the *server* based on how you are connected.

### Trying Some Commands

Run some commands on **your computer** and the **remote computer** (if you have access to it. I did not try this because I worked solely on my computer). Here's a list of commands to try:
   * `pwd`
   * `ls`
   * `cd ~`
   * `cd`
   * `ls -lat`
   * `ls -a`
   * `cp /home/linux/ieng6/cs15lwi23/public/hello.txt ~/`
   * `cat /home/linux/ieng6/cs15lwi23/public/hello.txt`

Experiment and have fun!

Some examples of what you may get:

![Example 1](https://github.com/sbalatbat/cse15l-lab-reports/blob/main/Screenshot%20(commands%201).png)
![Example 2](https://github.com/sbalatbat/cse15l-lab-reports/blob/main/Screenshot%20(commands%202).png)
![Example 3](https://github.com/sbalatbat/cse15l-lab-reports/blob/main/Screenshot%20(commands%203).png)

---
Congrats! You can now log in to your course-specific account on your computer. To log out of the remote server in your terminal, you can use:
   * Ctrl + D
   * Run the command `exit`
