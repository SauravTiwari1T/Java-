![image](https://github.com/user-attachments/assets/a90026c6-6538-4179-8182-8598eaca5841)# Java-
# Chapter array 

## Selection Sort:
class Selection {

    public static void main(String[] args) {
        int[] a = {20, 30, 99, 50, 60, 70, 80};

        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int position = i;

            for (int j = i + 1; j < a.length; j++) {
                if (min > a[j]) {
                    min = a[j];
                    position = j;
                }
            }

            int temp = a[i];
            a[i] = a[position];
            a[position] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

# output :

![image](https://github.com/user-attachments/assets/1c90139d-1caf-45e4-b875-0e54deef049e)
![image](https://github.com/user-attachments/assets/d651be97-cf71-47ec-a11f-ac8d10ca329b)


# variable  table 
![image](https://github.com/user-attachments/assets/651c259a-7013-4616-a205-5d91e21dd01f)


# 2. ![image](https://github.com/user-attachments/assets/0e71fd01-fcfd-4057-b42c-39eececf39c7)


