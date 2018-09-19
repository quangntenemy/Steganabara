Steganabara
===========

Steganabara is a tool for stegano analysis ([steganalysis](https://en.wikipedia.org/wiki/Steganalysis)), with some of the ideas originated from my final year project.

As I solved many stegano challenges, Steganabara has now matured and is very effective on visual steganos, especially [BaRa's challenges](http://www.bright-shadows.net/userstats.php?username=BaRa).

Features
========
Bit Mask Filter
---------------
An image is basically a map of ARGB values. A popular method for hiding data is using the bit layers of the ARGB elements. The Bit Mask Filter helps you analyse the bit layers, either seperately or in combination. The *amplify* option can make things clearer for human eyes.

Color Map Filter
----------------
Another popular method is using different colors with similar RGB values that are indistinguishable by human eyes. But now with the Color Map Filter that trick won't work anymore.

Color Explorer
--------------
This is a must-have feature for every visual stegano tool. With this you can investigate each pixel closely.

Histogram
---------
A histogram is like a fingerprint for an image. By looking at an image histogram, you can tell how much data is contained within it. And many wonderful things can be done with histogram analysis, notably image classification. For steganalysis, histograms can be a big help in detecting noises and distortion caused by the hidden data.

Color Table
-----------
The Color Table provides a more detailed view of the histogram. Just like histograms, the statistics from the Color Table can help detecting the hidden data. And conveniently, double clicking on a row in the Color Table will take you to the Color Map for that color.

Demonstrations
==============
* [Bit Mask Filter applied on a stegano-image from wikipedia](http://wechall.blogspot.com/2007/11/steganabara-explained.html)
* [TUTORIAL - Steganography in PNG Images](https://www.youtube.com/watch?v=KUZVIBXfoeA) by ARG Solving Station
* [Steganabara used to solve a Sunshine CTF 2016 challenge](https://sljrobin.org/blog/sunshine-ctf-2016-butterfly-effect/)

Related
=======
* [A Challengers Handbook by Caesum](http://www.caesum.com/handbook/stego.htm), with more information about steganography, reference to Steganabara and another tool for steganalysis - Stegsolve

Contact
=======
If you encountered any bug with Steganabara, or have any idea for new features/techniques, you can either [email me](mailto:quangntenemy[at]gmail.com), [post a comment in my blog](http://quangntenemy.blogspot.com/), or [post a comment on the Ohloh project page](http://www.ohloh.net/projects/steganabara/).
