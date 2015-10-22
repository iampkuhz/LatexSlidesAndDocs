LatexSlidesAndDocs
==================

纪录所有使用latex生成的ppt和文件。以后再使用latex时可以方便的快速查找。_每个文件都可以直接编译，包含了所需的全部附件文件。使用的环境为ubuntu+kile+texlive2013/texlive2014_

#### [1012] 工学院计算概论助教课slides

2015秋工学院计算概论课助教课，介绍windows下VS2010使用和ubuntu命令行下gcc编译c程序

> 代码
* 插入代码高亮
* 侧边导航显示（setbeamercovered，only标签的混合使用）
> [Slides](Slides/20151009.GccDemoInCSIntroCourse/latex/winVSDemo.pdf)

#### [0607] Glove 算法介绍

小组会报告，主要将[Glove](http://nlp.stanford.edu/projects/glove/)这个词向量生成工具，主要是将这篇论文[GloVe: Global Vectors for Word Representation](Slides/20150617.Glove/GloVe\:\ Global\ Vectors\ for\ Word\ Representation.pdf)，此外还介绍了一下word2Vec的实现方式。论文主要是解释他提出的这个训练时的目标函数是如何一步步转换得到的，并且说明了其实他的这个目标函数（利用了共现频率信息）和word2vec很像，所以是合理的。

> [slides](Slides/20150617.Glove/Glove_Slides_hz.pdf)

#### [0513] Retrofitting Word Vectors to Semantic Lexicons

小组组会报告，[NAACL2015 best paper](http://naacl.org/naacl-hlt-2015/best-paper-awards.html)

> **遗留问题:** :

> - lazy updates (Carpenter, 2008)具体算法
> - GloVe和word2vec的算法、异同？


## [0508] Injecting Logical Background Knowledge into Embeddings for Relation Extraction

大组会报告，[NAACL 2015 long talk](http://naacl.org/naacl-hlt-2015/papers.html)。利用特征模板抽取（标注）一些实体对的关系（pattern），加上自己设计的一阶逻辑（first-order-logic），预测实体对在freebase中含有的关系（relation)


## [0403] 大组会报告，最近工作


## [0122] 实验室2014秋季学期期末总结 


## [0109] Dynamic Pooling and Unfolding Recursive Autoencoders for Paraphrase Detection

模式识别期末报告，[NIPS 2011]递归使用感知机（RAE）对句子的语义进行提取，socher提出


## [0109] Sentence representation via Recursive Nerual Networks

大组会报告，介绍三篇使用tre-RNN的文章（Recursive nerual networks）

- [NIPS 2011] Dynamic pooling and unfolding recursive autoencoders for paraphrase detection

    递归使用自动编码机来提取句子级别的语义信息，作为特征判断复述

- [EMNLP 2011] Semi-Supervised Recursive Autoencoders for Predicting Sentiment Distributions

    在句子的句法树上使用RAE来提取句子的语义信息，判断句子的情感极性

- [TACL 2014] Grounded Compositional Semantics for Finding and Describing Images with Sentences

    给定句子的依存树，构建RNN来提取句子的语义信息，判断是否表述同一事物

## [0109] 自然语言处理大作业（复述判断）报告


## [1204] Typed Tensor Decomposition of Knowledge Bases For Relation Extration

小组会报告，利用张量分解进行关系抽取


# Docs/算法分析作业

目录下是算法课作业时使用的latex源文件，包括生成pdf所用的图片的文件，可直接编译
