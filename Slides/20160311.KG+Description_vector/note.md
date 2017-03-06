
# 问题

# 论文思路
1. CBOW和CNN 2个encoder
2. 联合学习，效果好，recall高
## 简介
1. KBC问题
2. 别人没用好triple
3. 我们可以解决triple中出现少的实体训练不足的问题
## 相关工作
1. transE、transH、transR、PTransE
2. 文本+triple：socher.NTN（？）,WikipediaAnchor（？）,...
## 训练目标
1. CBOW：Wikipedia全文中TF-IDF最高的20个单词
2. CNN：去停词，phrase变word，、、、
## 实验
1. 数据集：FB15k 删除部分信息 （FB15k原来规模？）
2. 参数
3. KBC实验：效果提升好少，怎么使用TransE效果比原作好？（？）原作多少？
4. RelPred实验:
5. zero-shot 占多少？4/19in FB20K


## 对比

### EMNLP2015 text embed by descrip
1. 效果比本文好，且没有删数据
### EMNLP2015 
1. 下过最好，但是删了最多的数据
