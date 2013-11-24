Concordion MultiFixture

Concordion (http://www.concordion.org/) is a nice little framework for writing integration tests.  It lets you create simple html files that can display results in any format.  The tests are all built by adding:

- a HTML File which contains the assertions
- a Java fixture file which provides the language for the html file

In my case, I have a few cases where it would be very handy to set up multiple html files for a single fixture class.  This is useful when e.g. you want testers to be able to add multiple files and run the same tests over and over.

This project is an example of how to achieve this,  

If you have suggestions or want to get involved, ping me mark.davis2@gmail.com.