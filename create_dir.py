import os
import sys


def run():
    main_dir = sys.argv[1]
    task_num = sys.argv[2]
    directory_name = sys.argv[3]
    link = sys.argv[4]
    update_global_readme(link, task_num)
    create_directory_with_readme_file(main_dir, directory_name, link)


def create_directory_with_readme_file(main_dir, directory_name, link):
    os.chdir(main_dir)
    os.chdir("main/src")
    os.mkdir(directory_name)
    os.chdir(directory_name)
    readme_file = open("README.md", "w+")
    readme_file.write("## Solution for problem:\r\n")
    readme_file.write(link)
    readme_file.close()


def update_global_readme(link, task_num):
    readme_file = open("README.md", "a")
    readme_file.write(task_num + " " + link + "\r\n")
    readme_file.close()


if __name__ == "__main__":
    run()
