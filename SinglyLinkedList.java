����   4 P  r3point9/SinglyLinkedList  java/lang/Object head  Lr3point9/SinglyLinkedList$Node; 	Signature %Lr3point9/SinglyLinkedList$Node<TE;>; tail size I <init> ()V Code
    	    	   	 	   
  LineNumberTable LocalVariableTable this Lr3point9/SinglyLinkedList; LocalVariableTypeTable  Lr3point9/SinglyLinkedList<TE;>; ()I
  !   r3point9/SinglyLinkedList$Node " # getNext "()Lr3point9/SinglyLinkedList$Node; node len StackMapTable isEmpty ()Z first ()Ljava/lang/Object; ()TE;
  - ' (
  / 0 * 
getElement last addFirst (Ljava/lang/Object;)V (TE;)V
  6  7 5(Ljava/lang/Object;Lr3point9/SinglyLinkedList$Node;)V e Ljava/lang/Object; TE; addLast
  = > ? setNext #(Lr3point9/SinglyLinkedList$Node;)V newest removeFirst answer getSecondToTheLast E java/lang/Error G OUnresolved compilation problem: 
	Syntax error on token ")", delete this token

 D I  J (Ljava/lang/String;)V 
SourceFile SinglyLinkedList.java (<E:Ljava/lang/Object;>Ljava/lang/Object; InnerClasses Node !                	         
    	        `     *� *� *� *� �               	                                
      �     *� =*� L� �+� L+*� ����           &  '  (  '  )              
  $     %               &   
 �    ' (     P     *� � ��           -                         &    	  ) *      +    ^     *� ,� �*� � .�           0  1 	 2                         &    	  1 *      +    ^     *� ,� �*� � .�           5  6 	 7                         &    	  2 3      4    �     **� Y+*� � 5� *� � **� � *Y� `� �           <  =  >  ? ) @        *       * 8 9         *       * 8 :  &      ; 3      4    �     1� Y+� 5M*� ,� *,� � *� ,� <*,� *Y� `� �           B 
 C  D  F ! G & H 0 I         1       1 8 9  
 ' @           1       1 8 :  
 ' @   &   	 �    A *      +    �     4*� ,� �*� � .L**� � � *Y� d� *� � *� +�       "    K  L 	 M  N  O & P - Q 2 R        4      # B 9         4      # B :  &   	 	� (   C *      +    F     
� DYF� H�           U        
            
      K    L     M N   
    O 
