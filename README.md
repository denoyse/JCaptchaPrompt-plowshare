JCaptchaPrompt-plowshare
========================

This is a captcha input prompt for plowshare written in Java.

It's benefit above plowshare's buit-in solutions is, that it displays the captcha image and prompts for input within the same graphical window. As a result, you can launch multiple downloads in the same terminal in parallel while still being able to input captchas.

In comparison, plowshare's imagemagick captcha viewer displays the captcha image, but input has to be done via the terminal.


How to use
==========

Simply add the switch 

    --captchaprogram path/to/JCaptchaWrapper.sh

to your usual command line switches.
