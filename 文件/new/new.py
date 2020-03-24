# coding=utf-8
import pandas as pd
#import xlwt

# 读取csv文件 3列取名为 name,sex,births，后面参数格式为names=

names1880 = pd.read_csv(r'C:\Users\10700\OneDrive\桌面\total.csv',
                        names=['id', 'name', 'college','phone','add','date','infect','contact'],
                        encoding = 'utf-8');
print (names1880);
print (names1880.groupby('infect').date.count());
print (names1880.groupby('contact').date.count());
names1880.groupby('infect').date.count().to_csv(r'C:\Users\10700\OneDrive\桌面\tongji.csv')

