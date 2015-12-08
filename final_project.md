####Final Project
## All about perspective
###--Perspective transformation & 3D Reconstruction from light field image

####Liz Zhang

###The idea
In this project we tried combining a drone with a 360 lens and have it fly straight, up, down, and spin to get the raw footages which we use to edit into a music video.

###Tools
The tools used for this project are a Lytro Camera, Matlab, Lytro Desktop, and Meshlab

###Process & Result
#### 1. Perspective Transformation
We view the world from different perspectives, the transformation between the object we see from where we stand and another point of view is perspective transformation. This can be easily calculated using homography matrix. Given 4 points (x,y corrdinates) of one image, and 4 matching points of the perspective we want to view the object from, we can reconstruct the image and obtain another perspective of the given object.
Below shows one example:
This is a picture taken from the Carnegie Museum of Art:
![img_0148](https://cloud.githubusercontent.com/assets/11666005/11649129/9d407cc8-9d49-11e5-80ff-bd4cbc99eed0.jpg)
Imagine ourselves floating in the air and view the artwork from mid air, what we see would look like this:
![demo_h_crp](https://cloud.githubusercontent.com/assets/11666005/11649128/9d3d675e-9d49-11e5-837d-d061e56b370a.jpg)

#### 2. 3D reconstruction using light field data

Using the Lytro Desktop we can extract a depth map and a refocused image. These are the data I used for 3D reconstruction.
Results are shown below:
[![](https://cloud.githubusercontent.com/assets/11666005/11649227/ca3b8a8c-9d4a-11e5-9efb-5058d81cb983.png)](https://vimeo.com/148189063)




