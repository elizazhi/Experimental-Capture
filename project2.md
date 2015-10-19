#Project 2
## A Person in Time - An Application of Eulerian Video Magnification on 3D Portrait
####Liz Zhang

###The idea
Eulerian Video Magnification is a technique to visualize subtle changes of color or movement in videos by magnifying signals of a chosen frequency. This technique was first proposed in the paper [Eulerian Video Magnification for Revealing Subtle Changes in the World](http://people.csail.mit.edu/mrub/papers/vidmag.pdf)
In this project I captured a 3D video of a person and added wrapping motion to it at the the same attitude and frequency as the person’s heart rate.

###Tools
The tools used for this project are a DepthKit (a DSLR camera and a Kinect). The DSLR is calibrated with the Kinect to obtain the  RGBD data. 

###Process
Video capture
2.   Eulerian Video Magnification
The video captured by the DSLR is processed with the method described in the Eulerian Video Magnification. The frequency range of 70 to 95Hz single is extracted and amplified. However instead of visualizing the amplified result as color change directly in the video, I extract the signal by choosing the mean of human face area in I channel (of the HIV color space). Did some more frequency cleaning to obtain the approximate signal changing pattern. Shown as below:

This signal was then parsed to an xml file to substitute XSinAmpt.xml this file was then used to generate the wrap motion using DepthKit visualization.

###Final result


