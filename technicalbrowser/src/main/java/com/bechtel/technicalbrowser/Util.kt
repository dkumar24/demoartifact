package com.bechtel.technicalbrowser

fun String.changeDotWithUnderScore():String
{
    return this.replace(".","_")
}