# 使用 psutil 获取目标进程的 CPU 和 memory 使用情况
import time
import psutil
import os

# 替换为目标进程号
pid = 38740

p = psutil.Process(pid)

filename = f'{p.name().split(".")[0]}_{pid}.csv'

f = open(filename, "a+")
f.write("TIME,%CPU,%MEM\n")
f.close()

while True:

    f = open(filename,"a+")

    current_time = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime(time.time()))

    line = f'{current_time},{p.cpu_percent()},{p.memory_info().rss/1024/1024}'

    print(line)

    f.write(line+"\n")

    f.close()
    time.sleep(1)


