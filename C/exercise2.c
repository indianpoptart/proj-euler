#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <assert.h>


int main(int argc, char ** argv)
{
    int c, last = 0; /* c must be type int, not char to match end of file (EOF) */
    size_t ln = 1;      /* use size_t for counters */
    /* use filename provided as 1st argument (stdin by default) */
    FILE *fp = argc > 1 ? fopen (argv[1], "r") : stdin;

    if (!fp) {  /* checks for a proper file */
        perror ("file open failed");
        return 1;
    }
    printf ("%6d ", ln++);               /* output line 1 number and increment counter */
    while ((c = getc(fp)) != EOF) {     /* read each character */
        if (last)                       /* test if last set */
            putchar (last);             /* output all characters */
        if (last == '\n' && c != '\n')  /* test if last is newline and ensures the current line is not blank */
            printf ("%6d ", ln++);       /* output next line number */
        last = c;                       /* set last to c */
    }
    putchar (last);                     /* output final character */
    if (last != '\n')                   /* check POSIX eof */
        putchar('\n');                  /* tidy up with newline */
    if (fp != stdin)                    /* close file if it isn't the  */
        fclose (fp);

    return 0;                           /* Terminate the function */
}