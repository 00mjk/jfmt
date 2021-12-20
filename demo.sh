#!/usr/bin/env -S bash

RED='\033[1;31m'
RESET='\033[0m'
LCYAN='\033[1;36m'
YELLOW='\033[1;33m'

printf "${RED}      _     ___  __  __   _____  \n"
printf "${RED}   _ | |   | __||  \/  | |_   _| \n"
printf "${RED}  | || |   | _| | |\/| |   | |   \n"
printf "${RED}  _\__/   _|_|_ |_|__|_|  _|_|_  \n"
printf "${RED}_|\"\"\"\"\"|_| \"\"\" |_|\"\"\"\"\"|_|\"\"\"\"\"| \n"
printf "${RED}\"\`-0-0-\'\"\`-0-0-\'\"\`-0-0-\'\"\`-0-0-\'\n\n"

start() {
    printf "${LCYAN}Which demo would you like to see?\n"
    printf "${LCYAN}[${RESET}1${LCYAN}] ${RESET}16 Basic Colors\n"
    printf "${LCYAN}[${RESET}2${LCYAN}] ${RESET}256 Colors\n"

    printf "${LCYAN}choose ${RESET}(${LCYAN}1${RESET}/${LCYAN}2${RESET}) ${RESET}> ${YELLOW}"
    read option

    if [ $option == "1" ]
    then
        mvn clean install >&-
        java -jar target/jfmt-2.3.0.jar basic-colors
    elif [ $option == "2" ]
    then
        mvn clean install >&-
        java -jar target/jfmt-2.3.0.jar 256
    else
        printf "${RED}Please provide a valid answer! Try again. ${RESET}\n\n"
        start
    fi
}

start