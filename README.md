# 2d-convex-quad-collision-coordinate-detection
Purpose: tests collision or overlap of quadrilaterals by coordinate points.

Hello, please compile the "Detection.java" file or run in an appropriate IDE.
To install java:
go to https://www.oracle.com/java/technologies/javase-downloads.html
download appropriate software (I used eclipse IDE to perform the tasks)
or manually compile with "javac Detection.java" then "java Detection" in command terminal

Sources used:
https://stackoverflow.com/questions/753140/how-do-i-determine-if-two-convex-polygons-intersect (used a simpler version comparison)
https://stackoverflow.com/questions/335600/collision-detection-between-two-images-in-java (later rejected as dealing with coordinates)
https://stackoverflow.com/questions/563198/how-do-you-detect-where-two-line-segments-intersect (part of comparison algorithm)
https://stackoverflow.com/questions/18838781/converting-string-array-to-an-integer-array (used code for template)

Limitations:
* Collision only fitted towards convex quadrilaterals (could possibly work with concave quadrilaterals; haven't tested).
* Program will only solve for collision, will not detect if one shape is fully enclosed in the other (is not formally a type of collision).
* Program detects and connects lines by order (see input issue 3 below).

Troubleshooting:

-------------------------------------------Input Issues----------------------------------------------------
1. Make sure the coordinates are entered x-coordinate first then y-coordinate separated by a space
Ex.
"1 2" is (1,2) on the coordinate plane
"1 2 3 4 5 6 7 8" is a quadrilateral with the coordinates (1,2), (3,4), (5,6), (7,8) on the plane

2. Check if the coordinates are listed in order clockwise or counterclockwise from the first point
Ex. (1, 1), (3, 4), (3, 1), and (1, 4) must be ordered ()

3. Please enter integer numbers only (This is given the Exam criteria of integer rows)

-----------------------------------------Compiling Issues----------------------------------------------------
1. Please make sure the Java version is up to date or installed properly (Further Instructions are Given by Download Website)

2. Double check if compiler is on correct filepath (path and folder options on default settings)

------------------------------------Unlisted issues or questions----------------------------------------------
Send me a message or text me at 309-660-0309
