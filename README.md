# Relatório

## Diagrama de classes UML

```JAVA


              ___________________________________________________________
             |                                                           |
 ____________^______________     _________________     __________________V_______________
|           Gasto          |    |      Ganho      |    |           Relatório             |
|__________________________|    |_________________|    |_________________________________|
| - tipo                   |    | - tipo          |    | - gerarRelatorioDeGastos()      |
| - data                   |    | - data          |    | - gerarRelatorioDeGanhos()      |
| - valor                  |    | - valor         |    | - gerarRelatorioDeSaldoMensal() |
| - formaPagamento         |    |                 |    |                                 |
|__________________________|    |_________________|    |                                 |
                                        V              |_________________________________|
                                        |                                ^
                                        |________________________________|
                                   
                  
                  
```                                                      
