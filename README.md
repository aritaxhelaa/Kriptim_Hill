#Kriptimi_Hill

Kriptimi Hill është kriptim klasik simetrik qe bazohet në algjebrën lineare, konkretisht në përdorimin e matricave për të koduar dhe dekoduar mesazhe.
Si  funksionon Kriptimi Hill?
-Mesazhi ndahet ne blloqe shkronjash, zakonisht me gjatësi 2 ose 3(varësisht nga madhësia e matrices).
-Cdo shkronjë konvertohet në numër, zakonisht sipas alfabetit(A=0, B=1, ...,Z=25).
-Përdoret një matricë çelës (key matrix) për të shumëzuar këto blloqe numrash.
-Rezultati modulo 26 (sepse ka 26 shkronja në alfabetin anglisht) jep kodimin.
-Për dekodim, përdoret inversa e matricës çelës (gjithashtu modulo 26).


