# Evaluating and Analyzing Global Terrorism Data

Terrorism has mushroomed due to its deep roots in certain locations of the world. With the increase in its activities, it is important to stop its spread or analyze the global terrorism data to identify terrorist activities. This project will help in detecting, evaluating, and analyzing global terrorism data.

In this project first, we make a good preprocessing by cleaning the data and normalizing it. Second, we build a model to predict the success of a terrorist attack using approaches in machine learning. Third, we make Evaluation Metrix for each model. Finally, we choose the suitable visualization for our data and model.

## Table of Contents:
1. How to install the dataset
2. Project Goals
3. Cleaning Data 
4. Normalization
5. Prediction Modeling
6. Evaluation metric
7. Visualization
8. Conclusion


### 1. How to install the dataset
The Global Terrorism Database GTD is an open-source database including information on terrorist attacks around the world from 1970 through 2017. The GTD includes systematic data on domestic as well as international terrorist incidents that have occurred during this period. The database is maintained by researchers at the National Consortium for the Study of Terrorism and Responses to Terrorism START, headquartered at the University of Maryland.
You can install the dataset from this link: https://www.kaggle.com/datasets/START-UMD/gtd

### 2. Project Goals
• Data Preprocessing: Cleaning Data 

• Data Preprocessing: Normalization

• Prediction Modeling with four machine learning algorithms

• Evaluation metric for each algorithm applied

• Choosing suitable visualization for the data

### 3. Cleaning Data
In this step, we have looked at the features of this dataset in detail and have improved, added, removed, and altered some of its features into more convenient forms.
First, we print the first 7 rows; doing this gave us a good idea of what data types we might be dealing with, what columns we
need to perform transformations or cleaning, and other data we might be able to extract. Second, we looked at the proportion of missing data; to get a good idea of which columns we’ll need to work with to resolve the missing values issue. Third, we start Renaming certain columns to better identifiable names. Finally, show rows after cleaning

### 4. Normalization
Normalization is a data preprocessing technique used to transform numerical data to a standard scale, making it easier to analyze and compare different variables. In this step, we start adjusting the values of numeric columns in a dataset to a common range, typically between 0 and 1 or -1 and 1.

### 5. Prediction Modeling
The purpose of this model is to predict the success of a terrorist attack. Four algorithms have been applied on some selected set of features from the dataset to achieve an maximum accuracy of 93%. 
The algorithms implemented are :
1.	Random Forest:    with an accuracy 93.00%
2.	Decision Tree Classifier: 	with an accuracy 90.00%
3.	Logistic Regression:    with an accuracy 87.00%
4.	Naive Bayes:   with an accuracy 86.90%

### 6. Evaluation metric
The evaluation metrics are used for evaluating the performance of a machine learning model, which is an integral component of any data science project. It aims to estimate the generalization accuracy of a model on the future (unseen/out-of-sample) data. So, in this phase, we make Evaluation Metrix for each model and this contains: Confusion Matrix, Accuracy, Recall, and Precision.

### 7. Visualization
We have visualized various contents from the Global Terrorism Database, to better understand the Datasets we are provided with. First, we present a barplot showing activities of terrorism over the years from 1970 to 2017, We explore that 2009 was the year with the most terrorist activities then 2010 & 2011. Second, we present types of terrorist Attacks and know that the most followed type is Bombing/Explosion. Then we have presented every country and types of attacks used to attack them. After that, we present a plot to show what the most targeted terrorists have to attack a country and we find that the most targeted are Private Citizens & Property. Afterward, we presented every terrorist target and types of attacks used to attack them. Finally, we could know that the region that has been attacked the most is South Asia more than 4000 times.

### 8. Conclusion
Terrorism has become a huge threat over the world. Various Machine learning systems, artificial intelligence, and Data Analytics have provided us with a system to help the investigator and anti-terrorist or counter-terrorist squad to rapidly decide whether the terrorist attack will succeed or not. We have demonstrated how the methods like Naive Bayes algorithm and Random Forest can help us predict the success of a terrorist attack precisely nine out of ten times. This helps anti-terrorist organizations a lot. In the future, we further mean to attempt different algorithms and methods like deep learning models and package classifiers to improvise the accuracy of the result and hence successfully predict the perpetrator with more precision and accuracy. 
