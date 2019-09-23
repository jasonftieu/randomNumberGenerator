import requests
import re
import time
                # Java VM                           Java App Engine                     Python VM                       Python App Engine
addr_list = ['http://34.67.239.124:8080/rng/', 'https://project-251314.appspot.com/', 'http://35.192.66.247:8000/', 'https://software-engineering-251917.appspot.com/']

for addr in addr_list:
    start_time = time.time()                    # start timer
    response = requests.get(addr)               # send request to address
    elapsed_time = time.time() - start_time     # stop timer
    nums = re.findall(r'\d+', response.text)    # extract all numbers from the response (should only be one number based on how this was written)
    print(addr)                                 # Print the info
    print(nums[0])
    print("Elapsed Time: " + str(elapsed_time) + '\n')