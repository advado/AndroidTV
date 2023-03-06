package com.kt.apps.core.utils

import android.util.SparseArray

object KeyCodeTranslator {
    private val map = SparseArray<String>().apply {
        addKeyAndValue("UNKNOWN", 0)
        addKeyAndValue("SOFT LEFT", 1)
        addKeyAndValue("SOFT RIGHT", 2)
        addKeyAndValue("HOME", 3)
        addKeyAndValue("BACK", 4)
        addKeyAndValue("CALL", 5)
        addKeyAndValue("ENDCALL", 6)
        addKeyAndValue("0", 7)
        addKeyAndValue("1", 8)
        addKeyAndValue("2", 9)
        addKeyAndValue("3", 10)
        addKeyAndValue("4", 11)
        addKeyAndValue("5", 12)
        addKeyAndValue("6", 13)
        addKeyAndValue("7", 14)
        addKeyAndValue("8", 15)
        addKeyAndValue("9", 16)
        addKeyAndValue("STAR", 17)
        addKeyAndValue("POUND", 18)
        addKeyAndValue("DPAD UP", 19)
        addKeyAndValue("DPAD DOWN", 20)
        addKeyAndValue("DPAD LEFT", 21)
        addKeyAndValue("DPAD RIGHT", 22)
        addKeyAndValue("DPAD CENTER", 23)
        addKeyAndValue("VOLUME UP", 24)
        addKeyAndValue("VOLUME DOWN", 25)
        addKeyAndValue("POWER", 26)
        addKeyAndValue("CAMERA", 27)
        addKeyAndValue("CLEAR", 28)
        addKeyAndValue("A", 29)
        addKeyAndValue("B", 30)
        addKeyAndValue("C", 31)
        addKeyAndValue("D", 32)
        addKeyAndValue("E", 33)
        addKeyAndValue("F", 34)
        addKeyAndValue("G", 35)
        addKeyAndValue("H", 36)
        addKeyAndValue("I", 37)
        addKeyAndValue("J", 38)
        addKeyAndValue("K", 39)
        addKeyAndValue("L", 40)
        addKeyAndValue("M", 41)
        addKeyAndValue("N", 42)
        addKeyAndValue("O", 43)
        addKeyAndValue("P", 44)
        addKeyAndValue("Q", 45)
        addKeyAndValue("R", 46)
        addKeyAndValue("S", 47)
        addKeyAndValue("T", 48)
        addKeyAndValue("U", 49)
        addKeyAndValue("V", 50)
        addKeyAndValue("W", 51)
        addKeyAndValue("X", 52)
        addKeyAndValue("Y", 53)
        addKeyAndValue("Z", 54)
        addKeyAndValue("COMMA", 55)
        addKeyAndValue("PERIOD", 56)
        addKeyAndValue("ALT LEFT", 57)
        addKeyAndValue("ALT RIGHT", 58)
        addKeyAndValue("SHIFT LEFT", 59)
        addKeyAndValue("SHIFT RIGHT", 60)
        addKeyAndValue("TAB", 61)
        addKeyAndValue("SPACE", 62)
        addKeyAndValue("SYM", 63)
        addKeyAndValue("EXPLORER", 64)
        addKeyAndValue("ENVELOPE", 65)
        addKeyAndValue("ENTER", 66)
        addKeyAndValue("DEL", 67)
        addKeyAndValue("GRAVE", 68)
        addKeyAndValue("MINUS", 69)
        addKeyAndValue("EQUALS", 70)
        addKeyAndValue("LEFT BRACKET", 71)
        addKeyAndValue("RIGHT BRACKET", 72)
        addKeyAndValue("BACKSLASH", 73)
        addKeyAndValue("SEMICOLON", 74)
        addKeyAndValue("APOSTROPHE", 75)
        addKeyAndValue("SLASH", 76)
        addKeyAndValue("AT", 77)
        addKeyAndValue("NUM", 78)
        addKeyAndValue("HEADSETHOOK", 79)
        addKeyAndValue("FOCUS", 80)
        addKeyAndValue("PLUS", 81)
        addKeyAndValue("MENU", 82)
        addKeyAndValue("NOTIFICATION", 83)
        addKeyAndValue("SEARCH", 84)
        addKeyAndValue("MEDIA PLAY PAUSE", 85)
        addKeyAndValue("MEDIA STOP", 86)
        addKeyAndValue("MEDIA NEXT", 87)
        addKeyAndValue("MEDIA PREVIOUS", 88)
        addKeyAndValue("MEDIA REWIND", 89)
        addKeyAndValue("MEDIA FAST FORWARD", 90)
        addKeyAndValue("MUTE", 91)
        addKeyAndValue("PAGE UP", 92)
        addKeyAndValue("PAGE DOWN", 93)
        addKeyAndValue("PICTSYMBOLS", 94)
        addKeyAndValue("SWITCH CHARSET", 95)
        addKeyAndValue("BUTTON A", 96)
        addKeyAndValue("BUTTON B", 97)
        addKeyAndValue("BUTTON C", 98)
        addKeyAndValue("BUTTON X", 99)
        addKeyAndValue("BUTTON Y", 100)
        addKeyAndValue("BUTTON Z", 101)
        addKeyAndValue("BUTTON L1", 102)
        addKeyAndValue("BUTTON R1", 103)
        addKeyAndValue("BUTTON L2", 104)
        addKeyAndValue("BUTTON R2", 105)
        addKeyAndValue("BUTTON THUMBL", 106)
        addKeyAndValue("BUTTON THUMBR", 107)
        addKeyAndValue("BUTTON START", 108)
        addKeyAndValue("BUTTON SELECT", 109)
        addKeyAndValue("BUTTON MODE", 110)
        addKeyAndValue("ESCAPE", 111)
        addKeyAndValue("FORWARD DEL", 112)
        addKeyAndValue("CTRL LEFT", 113)
        addKeyAndValue("CTRL RIGHT", 114)
        addKeyAndValue("CAPS LOCK", 115)
        addKeyAndValue("SCROLL LOCK", 116)
        addKeyAndValue("META LEFT", 117)
        addKeyAndValue("META RIGHT", 118)
        addKeyAndValue("FUNCTION", 119)
        addKeyAndValue("SYSRQ", 120)
        addKeyAndValue("BREAK", 121)
        addKeyAndValue("MOVE HOME", 122)
        addKeyAndValue("MOVE END", 123)
        addKeyAndValue("INSERT", 124)
        addKeyAndValue("FORWARD", 125)
        addKeyAndValue("MEDIA PLAY", 126)
        addKeyAndValue("MEDIA PAUSE", 127)
        addKeyAndValue("MEDIA CLOSE", 128)
        addKeyAndValue("MEDIA EJECT", 129)
        addKeyAndValue("MEDIA RECORD", 130)
        addKeyAndValue("F1", 131)
        addKeyAndValue("F2", 132)
        addKeyAndValue("F3", 133)
        addKeyAndValue("F4", 134)
        addKeyAndValue("F5", 135)
        addKeyAndValue("F6", 136)
        addKeyAndValue("F7", 137)
        addKeyAndValue("F8", 138)
        addKeyAndValue("F9", 139)
        addKeyAndValue("F10", 140)
        addKeyAndValue("F11", 141)
        addKeyAndValue("F12", 142)
        addKeyAndValue("NUM LOCK", 143)
        addKeyAndValue("NUMPAD 0", 144)
        addKeyAndValue("NUMPAD 1", 145)
        addKeyAndValue("NUMPAD 2", 146)
        addKeyAndValue("NUMPAD 3", 147)
        addKeyAndValue("NUMPAD 4", 148)
        addKeyAndValue("NUMPAD 5", 149)
        addKeyAndValue("NUMPAD 6", 150)
        addKeyAndValue("NUMPAD 7", 151)
        addKeyAndValue("NUMPAD 8", 152)
        addKeyAndValue("NUMPAD 9", 153)
        addKeyAndValue("NUMPAD DIVIDE", 154)
        addKeyAndValue("NUMPAD MULTIPLY", 155)
        addKeyAndValue("NUMPAD SUBTRACT", 156)
        addKeyAndValue("NUMPAD ADD", 157)
        addKeyAndValue("NUMPAD DOT", 158)
        addKeyAndValue("NUMPAD COMMA", 159)
        addKeyAndValue("NUMPAD ENTER", 160)
        addKeyAndValue("NUMPAD EQUALS", 161)
        addKeyAndValue("NUMPAD LEFT PAREN", 162)
        addKeyAndValue("NUMPAD RIGHT PAREN", 163)
        addKeyAndValue("VOLUME MUTE", 164)
        addKeyAndValue("INFO", 165)
        addKeyAndValue("CHANNEL UP", 166)
        addKeyAndValue("CHANNEL DOWN", 167)
        addKeyAndValue("ZOOM IN", 168)
        addKeyAndValue("ZOOM OUT", 169)
        addKeyAndValue("TV", 170)
        addKeyAndValue("WINDOW", 171)
        addKeyAndValue("GUIDE", 172)
        addKeyAndValue("DVR", 173)
        addKeyAndValue("BOOKMARK", 174)
        addKeyAndValue("CAPTIONS", 175)
        addKeyAndValue("SETTINGS", 176)
        addKeyAndValue("TV POWER", 177)
        addKeyAndValue("TV IN", 178)
        addKeyAndValue("STB POWER", 179)
        addKeyAndValue("STB IN", 180)
        addKeyAndValue("AVR POWER", 181)
        addKeyAndValue("AVR IN", 182)
        addKeyAndValue("PROG RED", 183)
        addKeyAndValue("PROG GREEN", 184)
        addKeyAndValue("PROG YELLOW", 185)
        addKeyAndValue("PROG BLUE", 186)
        addKeyAndValue("APP SWITCH", 187)
        addKeyAndValue("BUTTON APP 1", 188)
        addKeyAndValue("BUTTON APP 2", 189)
        addKeyAndValue("BUTTON APP 3", 190)
        addKeyAndValue("BUTTON APP 4", 191)
        addKeyAndValue("BUTTON APP 5", 192)
        addKeyAndValue("BUTTON APP 6", 193)
        addKeyAndValue("BUTTON APP 7", 194)
        addKeyAndValue("BUTTON APP 8", 195)
        addKeyAndValue("BUTTON APP 9", 196)
        addKeyAndValue("BUTTON APP 10", 197)
        addKeyAndValue("BUTTON APP 11", 198)
        addKeyAndValue("BUTTON APP 12", 199)
        addKeyAndValue("BUTTON APP 13", 200)
        addKeyAndValue("BUTTON APP 14", 201)
        addKeyAndValue("BUTTON APP 15", 202)
        addKeyAndValue("BUTTON APP 16", 203)
        addKeyAndValue("LANGUAGE SWITCH", 204)
        addKeyAndValue("MANNER MODE", 205)
        addKeyAndValue("3D MODE", 206)
        addKeyAndValue("CONTACTS", 207)
        addKeyAndValue("CALENDAR", 208)
        addKeyAndValue("MUSIC", 209)
        addKeyAndValue("CALCULATOR", 210)
        addKeyAndValue("ZENKAKU HANKAKU", 211)
        addKeyAndValue("EISU", 212)
        addKeyAndValue("MUHENKAN", 213)
        addKeyAndValue("HENKAN", 214)
        addKeyAndValue("KATAKANA HIRAGANA", 215)
        addKeyAndValue("YEN", 216)
        addKeyAndValue("RO", 217)
        addKeyAndValue("KANA", 218)
        addKeyAndValue("ASSIST", 219)
        addKeyAndValue("BRIGHTNESS DOWN", 220)
        addKeyAndValue("BRIGHTNESS UP", 221)
        addKeyAndValue("MEDIA AUDIO TRACK", 222)
        addKeyAndValue("SLEEP", 223)
        addKeyAndValue("WAKEUP", 224)
        addKeyAndValue("PAIRING", 225)
        addKeyAndValue("MEDIA TOP MENU", 226)
        addKeyAndValue("11", 227)
        addKeyAndValue("12", 228)
        addKeyAndValue("LAST CHANNEL", 229)
        addKeyAndValue("TV DATA SERVICE", 230)
        addKeyAndValue("VOICE ASSIST", 231)
        addKeyAndValue("TV RADIO SERVICE", 232)
        addKeyAndValue("TV TELETEXT", 233)
        addKeyAndValue("TV NUMBER ENTRY", 234)
        addKeyAndValue("TV TERRESTRIAL ANALOG", 235)
        addKeyAndValue("TV TERRESTRIAL DIGITAL", 236)
        addKeyAndValue("TV SATELLITE", 237)
        addKeyAndValue("TV SATELLITE BS", 238)
        addKeyAndValue("TV SATELLITE CS", 239)
        addKeyAndValue("TV SATELLITE SERVICE", 240)
        addKeyAndValue("TV NETWORK", 241)
        addKeyAndValue("TV ANTENNA CABLE", 242)
        addKeyAndValue("TV IN HDMI 1 ", 243)
        addKeyAndValue("TV IN HDMI 2 ", 244)
        addKeyAndValue("TV IN HDMI 3 ", 245)
        addKeyAndValue("TV IN HDMI 4 ", 246)
        addKeyAndValue("TV IN COMPOSITE 1 ", 247)
        addKeyAndValue("TV IN COMPOSITE 2 ", 248)
        addKeyAndValue("TV IN COMPONENT 1 ", 249)
        addKeyAndValue("TV IN COMPONENT 2 ", 250)
        addKeyAndValue("TV IN VGA 1 ", 251)
        addKeyAndValue("TV AUDIO DESCRIPTION", 252)
        addKeyAndValue("TV AUDIO DESCRIPTION MIX UP", 253)
        addKeyAndValue("TV AUDIO DESCRIPTION MIX DOWN", 254)
        addKeyAndValue("TV ZOOM MODE", 255)
        addKeyAndValue("TV CONTENTS MENU", 256)
        addKeyAndValue("TV MEDIA CONTEXT MENU", 257)
        addKeyAndValue("TV TIMER PROGRAMMING", 258)
        addKeyAndValue("HELP", 259)
        addKeyAndValue("NAVIGATE PREVIOUS", 260)
        addKeyAndValue("NAVIGATE NEXT", 261)
        addKeyAndValue("NAVIGATE IN", 262)
        addKeyAndValue("NAVIGATE OUT", 263)
        addKeyAndValue("STEM PRIMARY", 264)
        addKeyAndValue("STEM 1", 265)
        addKeyAndValue("STEM 2", 266)
        addKeyAndValue("STEM 3", 267)
        addKeyAndValue("DPAD UP LEFT", 268)
        addKeyAndValue("DPAD DOWN LEFT", 269)
        addKeyAndValue("DPAD UP RIGHT", 270)
        addKeyAndValue("DPAD DOWN RIGHT", 271)
        addKeyAndValue("MEDIA SKIP FORWARD", 272)
        addKeyAndValue("MEDIA SKIP BACKWARD", 273)
        addKeyAndValue("MEDIA STEP FORWARD", 274)
        addKeyAndValue("MEDIA STEP BACKWARD", 275)
        addKeyAndValue("SOFT SLEEP", 276)
        addKeyAndValue("CUT", 277)
        addKeyAndValue("COPY", 278)
        addKeyAndValue("PASTE", 279)
        addKeyAndValue("SYSTEM NAVIGATION UP", 280)
        addKeyAndValue("SYSTEM NAVIGATION DOWN", 281)
        addKeyAndValue("SYSTEM NAVIGATION LEFT", 282)
        addKeyAndValue("SYSTEM NAVIGATION RIGHT", 283)
        addKeyAndValue("ALL APPS", 284)
        addKeyAndValue("REFRESH", 285)
        addKeyAndValue("THUMBS UP", 286)
        addKeyAndValue("THUMBS DOWN", 287)
        addKeyAndValue("PROFILE SWITCH", 288)
    }

    private fun SparseArray<String>.addKeyAndValue(value: String, key: Int) {
        put(key, value)
    }

    fun translate(keyCode: Int): String = map.get(keyCode, keyCode.toString())
}