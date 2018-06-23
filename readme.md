# Using the FDF Toolkit for Java

This project demonstrates extracting form fields and values from a PDF form.

It assumes the PDF has been created using Adobe tools to create a PDF form. See:

[Creating and distributing PDF forms in Adobe Acrobat](https://helpx.adobe.com/acrobat/using/creating-distributing-pdf-forms.html)
 
This project uses two tools in sequence:

1. PDFtk Server to get an FDF file from a PDF
2. FDF Toolkit for Java to get form fields and values from an FDF file

## 1. PDFtk Server

We will use the [PDFtk Server](https://www.pdflabs.com/tools/pdftk-server/) to generate an FDF file from the PDF.

The PDFtk Server is part of [PDFtk - The PDF Toolkit](https://www.pdflabs.com/tools/pdftk-the-pdf-toolkit/) from [PDF Labs](https://www.pdflabs.com/) run by Sid Steward, 
who is also the author of [PDF Hacks (O’Reilly)](https://www.amazon.com/exec/obidos/ASIN/0596006551/ref=nosim/pdftk-20).

### Steps
#### 1 A. Download and install or compile

PDFLabs provides [PDFtk Server installers](https://www.pdflabs.com/tools/pdftk-server/) for Windows, macOS, Red Hat Enterprise Linux and CentOS.

You can compile PDFtk Server from its source code.

Many Linux distributions provide a PDFtk package you can download and install using their package manager.

##### Install workaround for macOS
The installer for [macOS from PDFtk Server](https://www.pdflabs.com/tools/pdftk-server/) does not produce any output for many commands.

The workaround is to [download the latest version - not listed on the official website](https://www.pdflabs.com/tools/pdftk-the-pdf-toolkit/pdftk_server-2.02-mac_osx-10.11-setup.pkg).

__Thanks to__ [PDFtk Server Install Workaround for Mac OS X](https://gist.github.com/jvenator/9672772a631c117da151)
and [stackoverflow pdftk-hanging-on-macos-sierra](https://stackoverflow.com/questions/39750883/pdftk-hanging-on-macos-sierra).

#### 1 B. Generate FDF from PDF
The format of the command to generate FDF from a PDF is:

```bash
pdftk INPUTACROFORM.pdf generate_fdf output EXTRACTEDFDF.fdf
```

For example:

```bash
pdftk SecuritySearchForm.pdf generate_fdf output extract.fdf
```

```bash
pdftk SecuritySearchFormSubmitted.pdf generate_fdf output extractSubmitted.fdf
```

### Documentation

PDFtk features are fully documented on its [man page](https://www.pdflabs.com/docs/pdftk-man-page/). 
There are also some [command-line examples](https://www.pdflabs.com/docs/pdftk-cli-examples/).


### PDFtk Server Commercial Support PDFtk Server Redistribution License

Consult PDFLabs for PDFtk Server Commercial Support and PDFtk Server Redistribution License terms.


## 2. Use the FDF Toolkit for Java to get the form fields and values from the FDF file

We will use the [Acrobat Forms Data Format (FDF) Toolkit](https://www.adobe.com/devnet/acrobat/fdftoolkit.html).


### Steps

#### 2 A. Include FDF Toolkit for Java in the Classpath

This project contains the FDF Toolkit for Java downloaded from [FDF Toolkit for Java](http://download.macromedia.com/pub/developer/acrobat/FDFToolkitForJava.zip) (ZIP: 2.2MB).

Include [jFdfTk.jar](FDF Toolkit for Java/Headers and Libraries/Java/jFdfTk.jar) in the Classpath.

__Note__: we agree to the terms as stated in the 
[FDF Toolkit End User License Agreement](https://wwwimages2.adobe.com/content/dam/acom/en/devnet/acrobat/pdfs/AcrobatFDFToolkitEULA.pdf).

#### 2 B. Run ExtractFields.java

Compile and run ExtractFields.main() from [src/ExtractFields.java](src/ExtractFields.java).

Output:
```
fieldName: NAME	fieldValue: VALUE
...

```


### Downloading the FDF Toolkit
__Note__: By downloading these files, you agree to the terms as stated in the End-User License Agreement included below.

[FDF Toolkit End User License Agreement](https://wwwimages2.adobe.com/content/dam/acom/en/devnet/acrobat/pdfs/AcrobatFDFToolkitEULA.pdf) (PDF, 48k)

[FDF Toolkit for Windows](http://download.macromedia.com/pub/developer/acrobat/FDFToolkitForWindows.zip) (ZIP: 2.2MB)

[FDF Toolkit for Java](http://download.macromedia.com/pub/developer/acrobat/FDFToolkitForJava.zip) (ZIP: 2.2MB)

[FDF Toolkit for Unix](http://download.macromedia.com/pub/developer/acrobat/FDFToolkitForUnix.tar.gz) (ZIP: 2.9MB)


## Other approaches

### [FDFToolkit.net is a Visual Studio .net library for PDF form data](http://www.nk-inc.com/software/fdftoolkit.net/)

### iText
