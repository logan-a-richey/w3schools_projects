#!/usr/bin/python3
# build_all.py

import os
import subprocess

def compile_cpp_files():
    # Get the current working directory
    cwd = os.getcwd()
    
    # Get all .cpp files in the current working directory
    cpp_files = [filename for filename in os.listdir(cwd) if filename.endswith(".cpp")]
    
    # Sort the list of .cpp files alphabetically
    cpp_files.sort()
    
    # Loop through all sorted .cpp files
    for filename in cpp_files:
        # Get the name without the .cpp extension
        output_name = filename[:-4]
        
        # Construct the g++ command to compile the .cpp file
        command = ["g++", filename, "-o", output_name]
        
        try:
            # Run the command
            subprocess.run(command, check=True)
            print(f"Compiled {filename} to {output_name}")
        except subprocess.CalledProcessError as e:
            print(f"Error compiling {filename}: {e}")

if __name__ == "__main__":
    compile_cpp_files()

