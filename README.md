# Bitmap-transformer:

This lab has been done in combined collaboration of William Fritts and Sudip Adhikari.

### Problem Domain: 
For this assignment you will be building a bitmap (.bmp) transformer CLI. It will read a bitmap in from disk, run one or more color or raster transforms and then write it out to a new file. This project will require manipulating binary data. Your solution should be composed of small tested methods that solve specific problems. Your methods should be thoughtfully named and well documented. You should run ./gradlew run --args 'input output transform' to run your application. Your bitmap transformer modules should not use any third party libraries.

### Minimum requirements:
The CLI should be architected using best modularization practices.

The CLI should contain a Bitmap class, and reading in a file should create a new Bitmap instance.

The CLI should require at least three arguments: input-file-path output-file-path transfrom-name.

The CLI should support a minimum of four transforms, each of which is an instance method in the Bitmap class.

The CLI should log useful Error messages if used incorrectly.

The CLI should log a success message on completion.

### Testing
Use JUnit to define descriptive tests.

Each @Test method should aim to test a small well defined feature of a function.

Write tests to ensure each function behaves correctly with valid and invalid inputs.


[Link to Code](https://github.com/sadhikari07/bitmap-transformer-/blob/master/src/main/java/bitmap/transformer/App.java)

[Link to Test](https://github.com/sadhikari07/bitmap-transformer-/blob/master/src/test/java/bitmap/transformer/AppTest.java)


### Running From Command Line

- ./gradlew run --args 'LANDS2.BMP colorChanged.bmp transformImageByColor(255)'
- ./gradlew run --args 'LANDS2.BMP gridCreated.bmp gridCreator(20, 20)'
- ./gradlew run --args 'LANDS2.BMP subImage.bmp cropper(0, 200, 200, 200)'
- ./gradlew run --args 'LANDS2.BMP dotMatrix.bmp transformImgDotMatrix(255)'


###Resources:
http://samples.fileformat.info/format/bmp/sample/dc59e50046b84768b5df4191ec16b9c3/LAND2.BMP?AWSAccessKeyId=0V91BEFA7GM093MEVMG2&Signature=GgqAoCAhs6dGzqFb2vk1lbhKzGQ%3D&Expires=1559340811

http://www.java2s.com/Tutorials/Java/Graphics_How_to/Image/Load_a_bitmap_image_and_manipulate_individual_pixels.htm

