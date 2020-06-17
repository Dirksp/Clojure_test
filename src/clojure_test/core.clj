(ns clojure-test.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet.")

(println "test")

(defn liefdesmachine
"test"
([naam liefdes-type]
(println "Janycka"liefdes-type naam
(if (= naam "Peter")
"Oeh, dat is lekker!"
" Shit, verkeerde vriendje")))
([naam]
(liefdesmachine naam "Schopt")))


(liefdesmachine "Ferdie"  )

(defn vierkant
"inhoud van vierkant"
([x]
(* x x x)
))

(vierkant 2)

(defn instructie
"Deze functie geeft de betrokkenen een instructie"
[mensen] 
(str "maak niet zo veel geluid, " mensen "!!!!"))

(defn groep
[& relschoppers]
(map instructie relschoppers))

(groep "Peter" "Hendrik" )

