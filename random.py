import random

# Generate a random number between 1 and 10
random_number = random.randint(1, 10)

# Print the random number
print("Random number between 1 and 10:", random_number)
import random
from collections import Counter

def generate_random_numbers(n):
    """Generate a list of n random numbers between 1 and 10."""
    return [random.randint(1, 10) for _ in range(n)]

def analyze_pattern(numbers):
    """Analyze the pattern of the given list of numbers."""
    # Count the frequency of each number
    frequency = Counter(numbers)
    
    # Find the most common number(s)
    most_common = frequency.most_common()
    
    # Detect any sequences or repetitions
    sequences = find_sequences(numbers)
    
    return frequency, most_common, sequences

def find_sequences(numbers):
    """Find sequences and repetitions in the list of numbers."""
    sequences = []
    current_sequence = [numbers[0]]
    
    for i in range(1, len(numbers)):
        if numbers[i] == numbers[i - 1]:
            current_sequence.append(numbers[i])
        else:
            if len(current_sequence) > 1:
                sequences.append(current_sequence)
            current_sequence = [numbers[i]]
    
    if len(current_sequence) > 1:
        sequences.append(current_sequence)
    
    return sequences

def print_analysis(frequency, most_common, sequences):
    """Print the analysis of the random numbers."""
    print("Frequency of numbers:")
    for number, count in frequency.items():
        print(f"Number {number}: {count} times")
    
    print("\nMost common number(s):")
    for number, count in most_common:
        print(f"Number {number}: {count} times")
    
    if sequences:
        print("\nSequences found:")
        for sequence in sequences:
            print(sequence)
    else:
        print("\nNo sequences found.")

# Generate a sequence of 100 random numbers between 1 and 10
random_numbers = generate_random_numbers(100)

# Analyze the pattern in the generated random numbers
frequency, most_common, sequences = analyze_pattern(random_numbers)

# Print the analysis
print_analysis(frequency, most_common, sequences)
