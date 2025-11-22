#include <stdio.h>

int main() {
    int roll, n, i;
    char name[50];
    char attendance;

    printf("Enter number of students: ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++) {
        printf("\nEnter Roll Number of student %d: ", i);
        scanf("%d", &roll);

        printf("Enter Name: ");
        scanf(" %[^\n]s", name);

        printf("Present (P) / Absent (A): ");
        scanf(" %c", &attendance);

        printf("\n--- Attendance Saved ---\n");
        printf("Roll: %d\n", roll);
        printf("Name: %s\n", name);
        printf("Status: %c\n\n", attendance);
    }

    return 0;
}
