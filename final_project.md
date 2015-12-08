####Final Project
## All about perspective
###--Perspective transformation & 3D Reconstruction from light field image

####Liz Zhang

###The idea
The world in photos is what the photographer sees, in other word, what the photographer notices. We are so used to look at the world from the photographer's perspective that we sometimes forget to ask "what would we have seen if we were there?" So how can we see things differently from a photo already taken? The lytro camera offers one option by letting the user take the photo first and focus on arbitraty object later. But that only makes the object clearer, it remains "stuck" in its "rightful" place and there is nothing it can do about it.

Except with projective transformation we can do something about it. And with a Lytro camera, there are more than one ways of viewing things differently. By constructing homographies and morphing we can theratically bring any object to the real center of the camera as if we are facing right at it. I would like to combine the lytro camera and perspective transformation, so that we not only change the focus of a scene, but also its perspective so the object in question not only becomes clearer, but brought to the center of the stage. Also, since the Lytro camera captures the depth of scene, we can use it to map the pixels to its depth and do 3D reconstruction from a single image. These are the two main ideas I will explore in this project.

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




