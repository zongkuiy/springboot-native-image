# Usage:
#     pm_collection.py <test_case_name>  <process_id> <jar|native>
# eg: pm_collection.py n1000w_c5000_tomcatthread1000  15222 jar
import sys
import time
import psutil
import os


type = sys.argv[3]
pid = int(sys.argv[2])
outname =  (sys.argv[1])

p = psutil.Process(pid)
current_time = time.strftime("%H:%M:%S", time.localtime(time.time()))
filename = f'{outname}_{current_time}.{type}.csv'

f = open(filename, "a+")
f.write("TIME,%CPU,MEM\n")
f.close()

while True:

    f = open(filename,"a+")

    current_time = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime(time.time()))

    line = f'{current_time},{p.cpu_percent()},{p.memory_info().rss/1024/1024}'

    print(line)

    f.write(line+"\n")

    f.close()
    time.sleep(1)


