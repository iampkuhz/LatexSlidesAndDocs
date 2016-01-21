

# 问题

1. DISTMULT模型？
2. PRA 2012 的文章text-graph的边是什么？
3. AdaGrad对于每个向量，每次更新的方向是怎么确定的？矩阵的更新方向呢？
4. E、F、DIST混合是直接吧f函数平均吗？：直接把f的值加起来
5. L-BFGS是什么？
6. without-mentions为什么反而高？

## 介绍
1. 本文基于 Riedel 13年工作，从KB+text中提取语义向量
2. riedel 13：从text提取实体对之前的dependency path，和KB统一到KGraph中
3. 之前的问题：很多文本的语义关系可能是很相似的，只有极少数单词不一样，应该被生成相同的/相似的关系

## 相关工作

相关工作：预测实体间的关系，并且没有句子级别的标注

1. KBC

> 1. Nickel, laoni: PRA: 基于图结构和同类实体的特点，双向随机游走+剪枝？贴图
> 2. 混合模型/关系的向量表示-》计算相似度
> 3. 本文基于DISTMULT + riedel13的E、F模型

2. 文本中抽取Relation

> 无先验知识，不用KB，一般基于dependency path表示实体间关系
> 不能表示‘相似的dependency path’
> 

3. 混合模型

> 1. PRA: KB+text-graph

本文的CNN：比LSTM快

## 问题定义

三元组，(e_s, r, ?) (?, r, e_o), 根据已有的三元组，预测实体间的未知关系
一般计算所有客体的相似度

## 模型

1. E、F、DISTMULT（优缺点，复杂度）

2. CONV：cnn

3. Loss func

4. 总体
