#!/bin/bash
# $1: module name
# $2: path to image
# $3: captcha type. For example: "recaptcha", "solvemedia", "digit-4".

BIN="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

cd $BIN

java JCaptchaPrompt $1 $2 $3

# Use stdout to send decoding result
exit 0
