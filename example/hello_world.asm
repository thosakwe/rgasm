section .data
    char db 'a'
    msg db "Hello, world!"

section .text
    print char
    print msg