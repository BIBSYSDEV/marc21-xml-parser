# marc21-xml-parser
A library that lets you convert xml to a reference object with the use of a parser.
The reference object offers multiple methods to extract data from the xml that was used as input.
The parser throws Marc21XmlParserExceptions that need to be caugth.

## To use the library: 
Add the following to your build.gradle file
1. Add "maven { url 'https://jitpack.io' }" to the list om repositories.
2. Add "implementation 'com.github.BIBSYSDEV:marc21-xml-parser:SMILE-553-CONVERT-TO-LIBRARY-SNAPSHOT' to your dependencies" 
3. Add configurations.all {
           resolutionStrategy.cacheChangingModulesFor 0, 'seconds'
       }
       to make sure you get the latest version of the library.