# Incrementa1000
Il programma TestInc1000 incrementa di mille un contatore statico per ogni ogetto appartenente alla classe, e lo stampa.

## Parte 1:

Nella prima parte il programma non esegue correttamente il suo compito poichè essendo la classe Inc1000 un thread, essa lavora in modo indipendente dal main. Ciò comporta che il main potrebbe concludersi prima del completamento dei thread, mandando così in output un numero molto inferiore a quello che ci si aspetterebbe.

**NB : Il thread contnua comunque a lavorare in background fino al raggiungimento del numero richiesto.**

## Parte 2:

Nella seconda parte abbiamo aggiunto il metodo .join() ai due oggetti della classe Inc1000. I metodi .join() fanno attendere la terminazione del thread chiamato al programma. In questo il .join() farà attendere al main il termine dell'esecuzione dei due thread.
Con questo metodo si risolve il problema del main, ma esiste una probabilità che il numero in output non sia il numero atteso, poichè i due thread potrebbero avere un conflitto di risorse, incrementando due volte lo stesso valore. Il risultato è comunque molto superiore alla prima parte del lavoro.

## Parte 3:

Nell'ultima parte dell'esperienza abbiamo aggiunto un secondo metodo di tipo synchronized. Sostanzialmente abbiamo spostato l'istruzione del incremento del contatore nel suddetto metodo, che verrà chiamato all'interno del ciclo al posto della precedente istruzione. Questa modifica è stata apportata per risolvere il problema del conflitto di risorse. 
