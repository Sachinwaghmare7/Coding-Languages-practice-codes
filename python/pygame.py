import pygame

# Initialize Pygame
pygame.init()

# Set up the display (window size: 400x300)
screen = pygame.display.set_mode((400, 300))
pygame.display.set_caption("Pygame Example")

# Run the game loop
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:  # If the user clicks the close button
            running = False

    # Fill the screen with a color (RGB white)
    screen.fill((255, 255, 255))  

    # Update the display to show changes
    pygame.display.flip()

# Quit Pygame after the game loop ends
pygame.quit()
