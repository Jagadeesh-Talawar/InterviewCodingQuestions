package com.test.examples.practice;

import com.stream.hard.example.Employee;

import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Practice {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 60000),
                new Employee(2, "Alice", "Finance", 55000),
                new Employee(3, "Bob", "HR", 609099),
                new Employee(4, "Carol", "Automation", 70000),
                new Employee(5, "David", "IT", 80000),
                new Employee(6, "Eve", "Finance", 90000),
                new Employee(7, "Ala", "HR", 100000),
                new Employee(7, "Jaga", "Automation", 20000000),
                new Employee(7, "Abhi", "IT", 2000000)
        );

        List<Integer> list = Arrays.asList(1, 1, 2, 2, 4, 3, 3, 3, 3, 4, 5, 6, 7, 8, 9, 0);

        List<Integer> result = list.stream().
                collect(Collectors.groupingBy(n -> n, Collectors.
                        counting())).entrySet().stream().filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(result);


        String str = "wesswejagadeesh";

        List<String> result1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(result1);


        List<Integer> list2 = Arrays.asList(10, 20, 30, 40);

        int result2 = list2.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        Integer i4 = list2.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1)
                .findFirst().get();
        System.out.println(result2);

        System.out.println(i4);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result3 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();

        System.out.println(result3);


        Map<String, Object> response = new LinkedHashMap<>();

        response.put("status", "SUCCESS");
        response.put("count", list.size());
        response.put("data", list);

        System.out.println(response);


        String str1 = "happy weekend";

        String reduce = Arrays.stream(str1.split(""))
                .reduce("", (a, b) -> b + a);

        System.out.println(reduce);
        // Sum of all the numbers
        List<Integer> sumOfAllNumbers = List.of(1, 2, 3, 4, 5, 6);

        Integer reduce1 = sumOfAllNumbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println(reduce1);

        // Count frequency of each character in a string
        String input = "java";
        Map<String, Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(collect);

        // Second highest number
        List<Integer> findingSecondHighest = List.of(1, 2, 3, 4, 5, 6);

        Integer i = findingSecondHighest.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(i);

        // Group employees by department
        Map<String, List<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(collect1);

        //Count employees in each department
        Map<String, Long> collect2 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(collect2);

        // Highest salary in each department
        Map<String, Optional<Employee>> collect3 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
        ));

        Map<String, Optional<Employee>> collect35 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(collect3);

        // Convert List to Map (id → name)
        Map<Integer, String> collect4 = employees.stream().collect(Collectors.toMap(
                Employee::getId,
                Employee::getName,
                (oldVal, newVal) -> newVal
        ));

        System.out.println(collect4);


        // Partition numbers into even and odd

        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        Map<Boolean, List<Integer>> collect5 = number.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(collect5.get(true));
        System.out.println(collect5.get(false));

        // First Non Repetive Character in a String

        String str2 = "JagguJ";

        String key = Arrays.stream(str2.split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().get();


        System.out.println(key);

        // Check if all numbers are even
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        boolean b = integers.stream().allMatch(n -> n % 2 == 0);

        System.out.println(b);

        // Flatten a list of lists

        List<List<Integer>> mast = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );

        List<Integer> result7 = mast.stream().flatMap(List::stream)
                .toList();

        System.out.println(result7);


        // Sort employees by salary then name

        List<Employee> list1 = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
                .toList();

        System.out.println(list1);


        // Count word frequency in a sentence

        String input2 = "java spring java boot spring";

        Map<String, Long> result9 = Arrays.stream(input2.split(" ")).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(result9);


        // Find words with length > 4

        List<String> words = Arrays.asList("java", "spring", "boot", "microservices");

        List<String> result10 = words.stream()
                .filter(w -> w.length() > 4)
                .collect(Collectors.toList());

        System.out.println(result10);

        //Convert list of integers to comma-separated string

        List<Integer> numbers2 = Arrays.asList(1, 2, 3);

        String collect6 = numbers2.stream().map(String::valueOf).collect(Collectors.joining(","));

        System.out.println(collect6);

        // Check if any number is divisible by 5

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 5, 10, 15);

        boolean b1 = numbers3.stream().anyMatch(n -> n % 5 == 0);

        System.out.println(b1);


        // Find average of numbers

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 5, 10, 15);

        double v = numbers4.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(v);


        // Find top 3 highest numbers

        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 5, 10, 15);

        List<Integer> list3 = numbers5.stream().sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println(list3);

        // Group strings by length

        List<String> words3 = Arrays.asList("Sunny", "Mooney", "Kony", "Toy");

        Map<Integer, List<String>> collect7 = words3.stream().collect(Collectors.groupingBy(String::length));

        // Program to calculate length of each word

       Map<Integer, List<String>> collect34 = words3.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(collect34);
        System.out.println(collect7);


        // Find duplicate characters in a string

        String inputs = "programming";

        List<String> result11 = Arrays.stream(inputs.split(""))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(result11);


        // Remove null values from list

        List<String> list12 = Arrays.asList("a", null, "b");

        List<String> collect8 = list12.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println(collect8);


        // Convert List<Employee> → Map<Dept, AverageSalary>

        Map<String, Double> collect9 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(collect9);

        List<Integer> numbers12 = List.of(1, 2, 3, 4, 5, 6, 8, 9);

        int sum = numbers12.stream().mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);


        List<String> lista = Arrays.asList("a", "b", "a", "c");

        Map<String, Long> result12 = lista.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(result12);


        List<String> list23 = Arrays.asList("aplle", "bsfswfdsfsdf", "fwsdfdf", "afewfwedsfsdfdsvgfsdgvsd");

        Map<String, Integer> collect10 = list23.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        String::length
                ));

        System.out.println(collect10);


        // Find all employees whose salary > department average

        Map<String, Double> collect11 = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
        ));

        System.out.println(collect11);

        List<Employee> list4 = employees.stream()
                .filter(e -> e.getSalary() > collect11.get(e.getDepartment()))
                .toList();

        System.out.println(list4);


        // First Non Repeting Character
        String inputs1 = "swiss";

        String result13 = Arrays.stream(inputs1.split(""))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println(result13);


        List<Integer> duplicates = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 0);
        // (1 -> 1), (2 -> 2), (3 ->1), (4 -> 1), (5 -> 2), (6 -> 1(, (7 -> 1), (8 -> 2), (9 -> 1), (0 -> 1)
        List<Integer> collect12 = duplicates.stream().collect(Collectors.groupingBy(
                        w -> w, LinkedHashMap::new, Collectors.counting()
                ))
                .entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(collect12);


        String wordsCounts = "I am learning java using java streams in streams";

        Map<String, Long> collect13 = Arrays.stream(wordsCounts.split(" "))
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ));


        System.out.println(collect13);

        List<Integer> list5 = list.stream().filter(Objects::nonNull).toList();

        System.out.println(list5);


        List<String> words23 = Arrays.asList("java", "spring");


        List<Integer> numbersForTest = List.of(1, 2, 3, 4, 5, 7, 8);

        Integer i1 = numbersForTest.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i1);


        List<String> words24 = Arrays.asList("java", "spring");

        List<String> list6 = words23.stream().flatMap(word -> Arrays.stream(word.split(""))).toList();
        System.out.println(list6);


        List<String> sentences = List.of("Java is powerful", "Streams are useful");

        List<String> words15 =
                sentences.stream()
                        .flatMap(s -> Arrays.stream(s.split(" ")))
                        .collect(Collectors.toList());

        System.out.println(words15);


        String s = "Java   is  powerful";

        List<Character> list7 = s.chars()
                .mapToObj(c -> (char) c)
                .toList();

        System.out.println(list7);

        String s1 = "Java Stream";

        List<Character> collect14 = s1.chars().mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        System.out.println(collect14);


        List<String> list19 = Arrays.stream(s1.split("")).toList();

        System.out.println(list19);

        String s3 = "Java Stream";

        long count = s3.chars().count();
        System.out.println(count);

        // Character frequency

        String s4 = "java";

        Map<Character, Long> collect15 = s4.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(collect15);


        Map<String, Long> collect16 = Arrays.stream(s4.split("")).collect(Collectors.groupingBy(
                w -> w,
                Collectors.counting()
        ));

        System.out.println(collect16);


        // First non-repeating character

        String s5 = "aabbccd";

        Character characterLongEntry = s5.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(characterLongEntry);

        String stringLongEntry = Arrays.stream(s5.split(""))
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(stringLongEntry);

        // First repeating character

        String s6 = "programming";

        Character collect17 = s6.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(collect17);

        String s2 = Arrays.stream(s6.split(""))
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(s2);

        // Print unique characters
        String s7 = "java";

        List<Character> collect18 = s7.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(w -> w.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(collect18);

        List<String> list8 = Arrays.stream(s7.split(""))
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();


        System.out.println(list8);


        // Count vowels
        String s8 = "Java is powerful";

        long count1 = s7.toLowerCase()
                .chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();

        System.out.println(count1);


        List<String> words20 = List.of("Java", "Spring");

        Map<Character, Long> collect19 = words20.stream()
                .flatMap(w -> w.chars().mapToObj(c -> (char) c))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(collect19);


        String s9 = "java streams";

        Character c1 = s9.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(c1);


        String s10 = "Java Stream JAVA";

        Map<String, Long> collect20 = Arrays.stream(s10.split(""))
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ));

        System.out.println(collect20);


        Map<Character, Long> collect21 = s10.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ));

        System.out.println(collect21);


        String s11 = "Java is Java Python is Python";
        Map<String, Long> collect22 = Arrays.stream(s11.split(" "))
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ));

        System.out.println(collect22);

        //Sort characters

        String s12 = "dcba";

        IntStream sorted = s.chars()
                .sorted();

        System.out.println(sorted);


        // Reverse string

        // Longest Word -> characters

        String s14 = "Java is very powerful";

        String s13 = Arrays.stream(s14.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(s13);

        // Character count per word

        String s15 = "Java Spring Boot";

        Map<String, Long> collect23 = Arrays.stream(s15.split(" "))
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ));
        System.out.println(collect23);


        Map<Character, Long> collect24 = s15.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ));

        System.out.println(collect24);


        // Remove duplicates (keep order)

        String s17 = "banana";

        Arrays.stream(s17.split("")).distinct().forEach(System.out::print);
        //System.out.println(collect25);


        // Characters occurring more than once

        String s18 = "mississippi";

        List<String> list9 = Arrays.stream(s18.split(""))
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(w -> w.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list9);

        List<Character> list10 = s18.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(w -> w.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list10);


        String a = "Java";
        String bc = "Java";
        System.out.println(a == bc);


        String string = new String("Java").intern();


        String str12 = "Java is powerful";

        String collect25 = Arrays.stream(str12.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));



        System.out.println(collect25);


        String str13 = "programming";
        String list11 = str13.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(list11);


        String str14 = "Java   is  powerful";

        long count2 = Arrays.stream(str14.trim().split("\\s+")).count();
        System.out.println(count2);


        List<String> inputs12 = List.of("Java", "Stream");

        List<Character> list13 = inputs12.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .toList();


        System.out.println(list13);


        String str15 = "Java is powerful";

        String collect26 = Arrays.stream(str15.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(collect26);

        List<String> list20 = List.of("Java", "API");

        list20.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c));


        boolean seen = false;
        Map.Entry<String, Double> best = null;
        Comparator<Map.Entry<String, Double>> comparator = Map.Entry.comparingByValue();
        for (Map.Entry<String, Double> stringDoubleEntry : employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
        )).entrySet()) {
            if (!seen || comparator.compare(stringDoubleEntry, best) > 0) {
                seen = true;
                best = stringDoubleEntry;
            }
        }

        Optional<Map.Entry<String, Double>>
                max = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(max);

        String[] input10 = {"Java", " ", null, "Streams", "", "Hello"};


        String[] result4 = Arrays.stream(input10)
                .filter(Objects::nonNull)
                .filter(s20 -> !s20.isBlank())
                .toArray(String[]::new);

        System.out.println(Arrays.toString(result4));

        String text = "Apple Banana Apple Orange Banana";

        Map<String, Long> collect27 = Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(
                        w -> w,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(collect27);

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : text.split(" ")) {

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

        }
        System.out.println(wordCount);


        Optional<Map.Entry<String, Double>> max1 = Optional.of(employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get());

        System.out.println(max1);

        // Highest paid salary in each department

        Map<String, Optional<Employee>> collect28 = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
        ));

        System.out.println(collect28);

        List<Employee> sorted1 = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();

        System.out.println(sorted1);

        Optional<Map.Entry<Character, Long>> collect29 = employees.stream()
                .map(x -> x.getName().charAt(0))
                .collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(collect29);

        List<String> words1 = List.of("Java", "Spring", "Hibernate", "Jpa");
        String collect30 = words1.stream().collect(Collectors.joining(", "));

        System.out.println(collect30);

        double averageSalary =  employees.stream().mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        System.out.println(averageSalary);

        Map<String, Double> collect31 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println(collect31);
        
        
        List<String> list15 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> collect32 = list15.stream().collect(Collectors.groupingBy(
                w -> w,
                Collectors.counting()
        ));

        System.out.println(collect32);

        List<Integer> numbers1 = Arrays.asList(2,6,8,6,5,3,9);

        long count3 = numbers1.stream()
                .filter(n -> n > 5)
                .count();

        System.out.println(count3);


        List<String> strings = List.of("Apple", "Banana");

        List<Character> list14 = strings.stream().flatMap(word -> word.chars().mapToObj(x -> (char) x)).toList();

        System.out.println(list14);


        String  inputs123 = "successes";

        Optional<Map.Entry<String, Long>> max2 = Arrays.stream(inputs123.split(""))
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                ;

        System.out.println(max2);


        List<String> words12 = Arrays.asList("apple", "apple","banana",
        "apple", "banana", "banana", "orange", "grape");

        Map<String, Long> first = words12.stream().collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(first);

        Optional<Map.Entry<String, Long>> first1 = first.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue())
                .skip(1)
                .findFirst();

        System.out.println(first1);


        Map<Integer, Long> collect33 = employees.stream().collect(Collectors.toMap(
                Employee::getId,
                Employee::getSalary,
                (oldVal, newVal) -> newVal
        ));

        System.out.println(collect33);


        List<Integer> numbers14 = List.of(1,2,3,4);

        try {
            numbers14.add(5);
        }
        catch (Exception e){
            System.out.println(" Exception while adding");
        }

        try {
            numbers14.set(2,3);
        }

        catch (Exception e){
            System.out.println(" Exception while Modifying");
        }

       List<Integer> nums = Arrays.asList(1,17,54, 14, 14,33, 45, -11);

        Integer i2 = nums.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().get();
        System.out.println(i2);

        Integer i3 = nums.stream().sorted().skip(1).findFirst().get();

        System.out.println(i3);

        List<Integer> nums1 = Arrays.asList(1,17,14,54,14,33,45,-11);




    }
}
