JCaptchaPrompt-plowshare
========================

This is a Captcha prompt for plowshare written in Java.

It was written because plowshare does not provide a captcha prompt where captcha image and user input are displayed together. E.g. it displays the captcha with imagemagick and reads input from terminal.

The benefit of this is, that you can launch multiple downloads in the same terminal in parallel while still being able to input captchas.

How to use
==========

plowshare --captchaprogram path/to/JCaptchaWrapper.sh
