import time

def start_game():
    print("\n=== TOM'S ADVENTURE ===")
    time.sleep(1)
    print("\nYou are Tom, an explorer searching for the lost treasure of the jungle!")
    time.sleep(1)
    print("Your choices will decide your fate...\n")
    time.sleep(1)
    
    # Start the adventure
    jungle_path()

def jungle_path():
    print("\nYou enter a dense jungle with two paths:")
    print("1. Take the left path (dark and mysterious)")
    print("2. Take the right path (sunny but noisy)")
    
    choice = input("\nWhat do you choose? (1 or 2): ")
    
    if choice == "1":
        dark_cave()
    elif choice == "2":
        river_crossing()
    else:
        print("Invalid choice! Try again.")
        jungle_path()

def dark_cave():
    print("\nYou enter a dark cave. It's cold and damp.")
    time.sleep(1)
    print("You see a glowing gem and a sleeping bear!")
    print("1. Try to take the gem quietly")
    print("2. Back away slowly")
    
    choice = input("\nWhat do you do? (1 or 2): ")
    
    if choice == "1":
        print("\nThe bear wakes up and growls! You run away but drop your map.")
        time.sleep(1)
        print("You escape but now you're lost...")
        lost_in_jungle()
    elif choice == "2":
        print("\nYou safely exit the cave and continue your journey.")
        treasure_ruins()
    else:
        print("Invalid choice!")
        dark_cave()

def river_crossing():
    print("\nYou reach a fast-flowing river.")
    time.sleep(1)
    print("A friendly monkey offers to help you cross.")
    print("1. Accept the monkey's help")
    print("2. Try to swim across")
    
    choice = input("\nWhat do you do? (1 or 2): ")
    
    if choice == "1":
        print("\nThe monkey safely carries you across!")
        treasure_ruins()
    elif choice == "2":
        print("\nThe current is too strong! You get swept away.")
        time.sleep(1)
        print("Luckily, you wash up near an ancient temple.")
        temple_entrance()
    else:
        print("Invalid choice!")
        river_crossing()

def lost_in_jungle():
    print("\nYou wander around, trying to find your way.")
    time.sleep(1)
    print("You hear strange noises...")
    print("1. Follow the sound")
    print("2. Climb a tree to look around")
    
    choice = input("\nWhat do you do? (1 or 2): ")
    
    if choice == "1":
        print("\nYou find a hidden village! The villagers help you.")
        treasure_ruins()
    elif choice == "2":
        print("\nYou spot the ruins in the distance and head there.")
        treasure_ruins()
    else:
        print("Invalid choice!")
        lost_in_jungle()

def temple_entrance():
    print("\nThe temple doors are locked with a riddle:")
    time.sleep(1)
    print("'I speak without a mouth and hear without ears. What am I?'")
    answer = input("\nYour answer: ").lower()
    
    if answer == "echo":
        print("\nThe doors open! You find the treasure inside!")
        time.sleep(1)
        print("=== YOU WIN! ===")
    else:
        print("\nNothing happens. The doors remain shut.")
        time.sleep(1)
        print("=== GAME OVER ===")

def treasure_ruins():
    print("\nYou arrive at ancient ruins filled with gold and jewels!")
    time.sleep(1)
    print("But a guardian blocks the way!")
    print("1. Fight the guardian")
    print("2. Offer a gift (if you have one)")
    
    choice = input("\nWhat do you do? (1 or 2): ")
    
    if choice == "1":
        print("\nThe guardian defeats you easily...")
        time.sleep(1)
        print("=== GAME OVER ===")
    elif choice == "2":
        print("\nYou have nothing to offer! The guardian attacks.")
        time.sleep(1)
        print("=== GAME OVER ===")
    else:
        print("Invalid choice!")
        treasure_ruins()

# Start the game
start_game()