Run("notepad.exe")
WinWaitActive("Untitled - Notepad")
Send("Hi welcome to AutoIt Scripting")
WinClose("Untitled - Notepad")
Send("{ENTER}")
WinWaitActive("Save As")
Send("F:\weekend.txt")
Send("{ENTER}")