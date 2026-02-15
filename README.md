<!--
SPDX-FileCopyrightText: 2024 TheKodeToad

SPDX-License-Identifier: CC0-1.0
-->

# JavaCheck
A very simple program to print provided system properties.

Each argument is printed out as `{arg}={System.getProperty(arg)}`. If any properties are null, they will not be printed and the program will exit with code 1.