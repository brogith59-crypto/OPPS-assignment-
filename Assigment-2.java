import re

# Class Definition
class WordFrequencyCounter:
    def _init_(self, text):
        self.text = text
        self.word_freq = {}

    # Method to process text
    def process_text(self):
        self.text = self.text.lower()
        self.words = re.findall(r'\b\w+\b', self.text)

    # Method to count frequencies
    def count_frequency(self):
        for word in self.words:
            self.word_freq[word] = self.word_freq.get(word, 0) + 1

    # Method to display result
    def display_frequency(self):
        print("\nWord Frequency:")
        for word, count in self.word_freq.items():
            print(f"{word}: {count}")


# Main Program
if _name_ == "_main_":
    user_input = input("Enter a string: ")
    
    # Create object
    counter = WordFrequencyCounter(user_input)
    
    # Call methods
    counter.process_text()
    counter.count_frequency()
    counter.display_frequency()
