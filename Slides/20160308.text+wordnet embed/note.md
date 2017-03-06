
# 问题

# 论文思路

1. 摘要：从text、wordnet分别学习vector，然后把他们组合起来
2. 实验结论：直接组合2个vector比训练一个vector要好，比retrofitting好
## 介绍
1. word embed有哪些用处
2. 本文贡献在于讨论如何组合不同来源的embed，证明即使是简单的拼接也比某些复杂模型好
## 相关工作
1. 2012年 将wordnet加入词向量训练，要求wordnet中有边的2个词向量尽量近
2. 2014.wang （transH)
3. 2015.tian 
4. retrofitting
5. faruqui 2014!!!
6. 2015 rastogi 使用GCCA来融合不同语言的训练语聊 （怎么做的？？？）
7. 本文的random walk是根据2015 Goikoetxea的文章证明的
## 词向量表示
1. text词向量：WBU+word2vec
2. WordNet词向量：random walk + word2vec
## 合并词向量
1. 简单组合：CAT，CEN，CMP （CMP再看一下，没懂）
2. 相关性分析：PCA（CAT进化），CCA（没太看懂？）
3. 语聊混合
4. sim-avg
## 实验
1. 数据集（RG？related？CMP的计算方式）
2. 实验一：效果
3. 实验二：和retrofitting对比；作者解释为什么比retrofitting好
4. 实验3：其他几个类似的系统（没有对比）
5. 混合多个embed

# slides 注意

1. 讲一下retrofitting
2. 
