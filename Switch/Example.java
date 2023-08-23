int value = 2;
String result = switch (value) {
    case 1 -> "One";
    case 2 -> {
        yield "Two";  // Execution stops here and "Two" is returned
    }
    case 3 -> "Three";
    default -> "Other";
};

_________________________________________________

int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    // ... other cases ...
    default:
        dayName = "Unknown";
        break;
}

System.out.println("Day: " + dayName);
