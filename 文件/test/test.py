import csv
import matplotlib
import pandas as pd
import matplotlib.pyplot as plt
import numpy as np


total = pd.read_csv('C:\\Users\\10700\\OneDrive\\桌面\\tongji.csv')

#print(df.fever.value_counts())

#允许显示汉字
plt.rcParams['font.sans-serif'] = ['SimHei']

#窗格大小及标题
plt.figure(figsize = [15,12])
plt.suptitle("统计分析图")

#数据
#num_cols = ['fever','infect','school']
#print(num_cols)
#print(df.fever.value_counts())

#柱状图
plt.bar(x = total.index.values,height = total['infect'],color = 'red',
        label = 'infect',tick_label = ['2020/3/18','2020/3/19','2020/3/20','2020/3/21','2020/3/22'])
plt.bar(x = total.index.values,height = total['contact'],color = 'steelblue',
        label = 'contact',bottom = total['infect'],
        tick_label = ['2020/3/18','2020/3/19','2020/3/20','2020/3/21','2020/3/22'])

plt.ylabel('人数（人）')
plt.legend(loc = 'best')
plt.show()
