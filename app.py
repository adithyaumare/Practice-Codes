def deviceNamesSystem(devicenames):

    # Dictionary to keep track of count for each device name
    name_counts = {}
    
    # List to store unique device names
    unique_names = []
    
    for name in devicenames:
        # If name hasn't been seen before
        if name not in name_counts:
            name_counts[name] = 0
            unique_names.append(name)
        else:
            # Increment counter for this name
            name_counts[name] += 1
            # Append number to make unique
            unique_names.append(f"{name}{name_counts[name]}")
            
    return unique_names

# Test Case 0
test0 = ["mixer", "toaster", "mixer", "tv"]
print(deviceNamesSystem(test0))
# Output: ['mixer', 'toaster', 'mixer1', 'tv']

# Test Case 1
test1 = ["tv", "lamp"]
print(deviceNamesSystem(test1))
# Output: ['tv', 'lamp']