# Collection Frameworks

**Ques 1 :** Perform the following operations:

- Create an empty list using collection frame work named list_days to hold the days of the week.
- Add all the weekdays to the created list except Wednesday.
- Print the resultant list
- Iterate the list using any three different ways(either using for or foreach or Iterator Interface)
- Add Sunday to the beginning of the list and Saturday to the ending of the list and Wednesday after Tuesday in the List.
- Set Sunday and Saturdays as Holiday.
- Check whether Holiday is present in list or not.
- Remove Holidays from the list.
- Copy all the elements form list_days into new list named week_days.
- Sort the new list and display it.
- Shuffle and display the elements of list_days.
- Compare days_list with week_days.
- Sort and Reverse both the lists.
- Compare days_list with week_day.
- Swap 1st and last elements in both the lists.
- Remove all the elements from the list_days.
- Check the list_days is empty or not.
- Shuffle and display the elements of list_days.
- Compare days_list with week_days.

**Code :**

```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        List<String>list_days = new ArrayList<>();
        list_days.add("Monday");
        list_days.add("Tuesday");
        list_days.add("Thursday");
        list_days.add("Friday");
        System.out.println("The resultant list : " + list_days);

        ListIterator<String> i1 = list_days.listIterator();
        System.out.print("Iterating the list using for loop : ");
        for(int i = 0; i < list_days.size(); i++)
            System.out.print(list_days.get(i) + " ");
        System.out.println();

        System.out.print("Iterating the list using foreach loop : ");
        for (String str : list_days)
            System.out.print(str + " ");
        System.out.println();

        System.out.print("Iterating the list using iterator interface : ");
        while(i1.hasNext())
            System.out.print(i1.next() + " ");
        System.out.println();

        list_days.add(0, "Sunday");
        list_days.add(list_days.size(), "Saturday");
        list_days.add(list_days.indexOf("Tuesday") + 1, "Wednesday");
        System.out.println("List after adding Sunday, Saturday and Wednesday : " + list_days);

        list_days.set(0, "Holiday");
        list_days.set(6, "Holiday");
        System.out.println("List after adding holidays : " + list_days);
        boolean ans = list_days.contains("Holiday");
        if(ans == true)
            System.out.println("Holidays present in the list");
        else
            System.out.println("Holidays not present in the list");

        list_days.remove("Holiday");
        list_days.remove("Holiday");
        System.out.println("The resultant list after removing holidays : " + list_days);

        List<String>week_days = new ArrayList<>();
        week_days.addAll(list_days);
        System.out.println("The new weekdays list : "+ week_days);

        week_days.sort(null);
        System.out.println("The sorted weekdays list : "+ week_days);
        Collections.shuffle(week_days);
        System.out.println("The shuffled list : "+ week_days);

        boolean bool = week_days.equals(list_days);
        System.out.println("Are the two lists equal? "+ bool);

        Collections.swap(week_days, 0, week_days.size() - 1);
        System.out.println("Weekdays list after swaping 1st and last element: "+ week_days);

        Collections.swap(list_days, 0, list_days.size() - 1);
        System.out.println("Days list after swaping 1st and last element: "+ list_days);

        Collections.reverse(week_days);
        System.out.println("Weekdays list after reversing: "+ week_days);

        Collections.reverse(list_days);
        System.out.println("resultant days list after reversing: "+ list_days);

        list_days.clear();
        week_days.clear();
        System.out.println("Days list after removing all the elements: " + list_days);
        System.out.println("Weekdays list after reversing the elements: " + week_days);

        boolean a2 = list_days.isEmpty();
        System.out.println("Is list days empty? " + a2);
    }
}
```

**Ques 2 :** Write a java program to simulate a Phone Book application with the following options.(The names and phone numbers should be saved into a file)

- **L.** Look up a phone number.
- **A.** Add or change a phone number.
- **R.** Remove an entry from your phone directory.
- **D.** List the entire phone directory.
- **E.** Exit from the program.

**Code :**

```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Map<String, String> phone = new HashMap<>();
        phone.put("Name1", "9876543210");
        phone.put("Name2", "9988776655");
        phone.put("Name3", "1122334455");
        System.out.println("Current Phonebook - \n" + phone);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        char c;
        String num;
        do{
            System.out.println("L. Look up a phone number\n" + "A. Add or change a phone number\n" + "R. Remove an entry from your phone directory\n" + "D. List the entire phone directory\n" + "E. Exit from the program\n");
            System.out.print("Please enter your choice ? : ");
            c = sc.next().charAt(0);
            switch(c){
                case 'L':
                    System.out.print("Enter the phone number you want to search : ");
                    num = sc.next();
                    System.out.println("Is the phone number present in phonebook ? " + phone.containsValue(num));
                    break;

                case 'A':
                    System.out.println("1. Add a phone number. \n" + "2. Change a phone number.");
                    System.out.print("Choose the correct option ? : ");
                    int ch = sc.nextInt();
                    if(ch == 1){
                        System.out.print("Enter the phone number : ");
                        String phone_num = sc.next();
                        System.out.print("Enter the phone number holder's name : ");
                        String phone_name = sc.next();
                        phone.put(phone_name, phone_num);
                        System.out.println("Phonebook currently - \n" + phone);
                    } else if(ch == 2){
                        System.out.print("Enter the phone number holder's name : ");
                        String phone_name = sc.next();
                        System.out.print("Enter the new phone number : ");
                        String phone_num = sc.next();
                        phone.replace(phone_name, phone_num);
                        System.out.println("Phonebook currently - \n" + phone);
                    }
                    break;

                case 'R':
                    System.out.print("Enter the person's name whose entry you want to remove from the phone directory : ");
                    String name = sc.next();
                    phone.remove(name);
                    System.out.println("Phonebook after removing the entry - \n" + phone);
                    break;

                case 'D':
                    System.out.println("Phonebook currently - \n" + phone);
                    break;

                case 'E':
                    System.exit(0);
                    break;
            }
            System.out.print("Please enter your next choice : ");
            c = sc.next().charAt(0);
        } while(c != 'E');
    }
}
```
