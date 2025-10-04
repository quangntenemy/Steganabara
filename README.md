Steganabara
===========

An advanced [steganalysis](https://en.wikipedia.org/wiki/Steganalysis) toolkit designed to reveal what's hidden in plain sight.

Built for solving challenges/CTF competitions, Steganabara has become a trusted instrument for solving [BARA-class challenges](http://www.bright-shadows.net/userstats.php?username=BaRa) - where precision, patience, and deep insight matter most.

Its modular design and visual analysis features make it a quiet weapon in the hands of digital explorers and cybersecurity researchers alike.

Features
========
Bit Mask Filter
---------------
An image is basically a map of ARGB values. A popular method for hiding data is using the bit layers of the ARGB elements.

The Bit Mask Filter helps isolates and visualizes these layers, either individually or in combination, revealing concealed information.

The *Amplify* option enhances subtle differences, making hidden patterns visible to the human eye.

Color Map Filter
----------------
Another common steganographic technique involves using color variations with nearly identical RGB values - imperceptible to the human eye.

The Color Map Filter exposes these subtle differences, transforming invisible color shifts into visible evidence.

What once blended seamlessly now stands out in full contrast.

Color Explorer
--------------
A must-have feature for any visual steganography toolkit.

The Color Explorer lets you inspect each pixel's exact ARGB composition, making hidden irregularities and subtle encodings immediately visible.
Precision down to the last bit.

Histogram
---------
A histogram acts like an image's fingerprint - visualizing the distribution of pixel intensities.

In steganalysis, histogram analysis can expose subtle noise patterns and distortions left behind by hidden data.

It's an essential tool for detecting irregularities that human eyes can't see.

Color Table
-----------
The Color Table offers a detailed numerical view of an image's color distribution - a more granular extension of the histogram.

Its statistical insights can reveal irregularities caused by hidden data.

Double-click any row to jump directly to the Color Map for visual analysis of that specific color.

Demonstrations
==============
* [Bit Mask Filter applied on a stegano-image from wikipedia](http://wechall.blogspot.com/2007/11/steganabara-explained.html)
* [TUTORIAL - Steganography in PNG Images](https://www.youtube.com/watch?v=KUZVIBXfoeA) by ARG Solving Station
* [Bit Mask Filter used to solve a 3DS CTF 2016 challenge](http://quangntenemy.blogspot.com/2016/12/3ds-ctf-2016.html)
* [Bit Mask Filter used to solve a Sunshine CTF 2016 challenge](https://sljrobin.org/blog/sunshine-ctf-2016-butterfly-effect/)
* [Histogram analysis with Steganabara helped solve a ASIS CTF Quals 2014 challenge](http://quangntenemy.blogspot.com/2014/05/asis-ctf-quals-2014.html)

Related
=======
* [A Challengers Handbook by Caesum](http://www.caesum.com/handbook/stego.htm), with more information about steganography, reference to Steganabara and another tool for steganalysis - Stegsolve

Contact
=======
If you encounter any bugs in *Steganabara* or have ideas for new features or techniques, you're welcome to reach out through any of the following channels:
- Open an issue or pull request on GitHub
- [Email me](mailto:quangntenemy[at]gmail.com)
- [Post a comment in my blog](http://quangntenemy.blogspot.com/)
- Or maybe have a look at [my profile](https://github.com/quangntenemy) for (maybe) the most updated information.
