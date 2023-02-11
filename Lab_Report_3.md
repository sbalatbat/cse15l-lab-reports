# Week 4 & 5 Lab Report

## Researching Commands: `find`

**What does `find` do?**
`find` "finds" files by recursively listing every folder and file in the given path's directory. The default directory is the working directory, and `find` outputs the path of files relative to the given path.

__Command-line options__
* `-type`
* `-name`
* `-delete`
* `-exec`

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
* Week 4 Wednesday Lecture Handout - `find` definition

### `-name`

Explanation

Example 1
```$ find -option2 command
output
```

Example 2
```$ find -option2 command
output
```

Source: [link2]()

### `-delete`

Explanation

Example 1
```$ find -option3 command
output
```

Example 2
```$ find -option3 command
output
```

Source: [link3]()

### `-exec`

Explanation

Example 1
```$ find -option4 command
output
```

Example 2
```$ find -option4 command
output
```

Source: [link4]()