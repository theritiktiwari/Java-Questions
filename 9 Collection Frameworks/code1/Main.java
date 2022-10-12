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