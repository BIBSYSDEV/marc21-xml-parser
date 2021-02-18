# marc21-xml-parser
A library that lets you convert xml to a reference object with the use of a parser.
The reference object offers multiple methods to extract data from the xml that was used as input.
The parser throws Marc21XmlParserExceptions that need to be caugth.

## To use the library: 
Add the following to your build.gradle file
1. Add "maven { url 'https://jitpack.io' }" to the list om repositories.
2. Add "implementation 'com.github.BIBSYSDEV:marc21-xml-parser:_version_'" to your dependencies

## Making a new version (updating the library):
1. Click **tags** in the next to the Branch-dropdown.
2. Choose the **Releases** tab.
3. Click **Draft a new release**.
4. Choose which branch you want the current version to be built from.
5. Enter a tag version example '2.1'
6. Enter a title and description.
7. Check the **This is a pre-release** box if the version is made from a development branch.
8. Click **Publish release**. The new version is now created and should be available as a library in a few minutes.
