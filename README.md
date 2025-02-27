## Tarefa 1
 **Exercício 1:**
 ```java
 package tarefa1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Idade em anos meses e dias: ");
		int idade = sc.nextInt();
		int idadeMeses = sc.nextInt();
		int idadeDias = sc.nextInt();
		
		idade  *= 365;
		idadeMeses *= 30;
		
		int somaDias = idade + idadeMeses + idadeDias;
		
		System.out.println();
		System.out.println("Idade em dias: " + somaDias);
		
		sc.close();
	}

}
```

| Entrada  | idade(anos) | idadeMeses  | idadeDias | somaDias  | Saída |
|----------------------|----------------------|---------------------------|------------------|----------------------|--------|
| 5 2 15              | 5 * 365 = 1825        | 2 * 30 = 60               | 15               | 1825 + 60 + 15 = 1900 | `Idade em dias: 1900` |
| 10 6 5             | 10 * 365 = 3650       | 6 * 30 = 180              | 5                | 3650 + 180 + 5 = 3835 | `Idade em dias: 3835` |
| 0 1 10             | 0 * 365 = 0           | 1 * 30 = 30               | 10               | 0 + 30 + 10 = 40      | `Idade em dias: 40` |
| 20 0 0             | 20 * 365 = 7300       | 0 * 30 = 0                | 0                | 7300 + 0 + 0 = 7300   | `Idade em dias: 7300` |
---

**Exercício 2:**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eleitores: ");
		double voters = sc.nextDouble();
		System.out.println("Votos brancos: ");
		double whVotes = sc.nextDouble();
		System.out.println("Nulos: ");
		double nulls = sc.nextDouble();
		System.out.println("Validos: ");
		double valids = sc.nextDouble();
		
		double whPercent = whVotes/voters * 100;
		double nullPercent = nulls/voters * 100;
		double validsPercent = valids/voters * 100;
		
		System.out.println();
		System.out.printf("Porcentagem brancos: %.1f%n", "%",  whPercent);
		System.out.printf("Porcentagem nulos: %.1f%n", "%", nullPercent);
		System.out.printf("Porcentagem validos: %.1f%n", "%", validsPercent);
		
		sc.close();
	}

}
```
| Total Eleitores | Votos Brancos | % Brancos | Votos Nulos | % Nulos | Votos Válidos | % Válidos |
|----------------|--------------|-----------|------------|---------|--------------|-----------|
| 1000          | 200          | 20.0%     | 150        | 15.0%   | 650          | 65.0%     |
| 500           | 50           | 10.0%     | 50         | 10.0%   | 400          | 80.0%     |
| 750           | 100          | 13.3%     | 200        | 26.7%   | 450          | 60.0%     |
---
**Exercíco 3:**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Salario: ");
		double salary = sc.nextDouble();
		System.out.println("Ajuste percentual: ");
		double newSalary = sc.nextDouble();
		
		salary = (salary * newSalary/100) + salary;
		
		System.out.printf("New salary: $%.2f%n", salary);
		
		sc.close();
	}

}
```
| Salário Atual | Ajuste Percentual | Novo Salário |
|--------------|------------------|-------------|
| 2000.00     | 10%               | 2200.00     |
| 3500.00     | 5%                | 3675.00     |
| 5000.00     | 8%                | 5400.00     |
| 4200.00     |
---
**Exercício 4:**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Custo carro fabrica: ");
		double preco = sc.nextDouble();
		double distribuidor = 28.0;
		System.out.println("% distribuidor: 28%");
		double porcentagemFab = 45.0;
		System.out.println("% imposotos: 45%");
		
		double novoPreco = (preco*porcentagemFab/100) + (preco*distribuidor/100) + preco;
		System.out.printf("Novo preco: $%.2f%n", novoPreco);
		
		sc.close();
	}

}
```
| Custo de Fábrica | % Distribuidor | % Impostos | Preço Final |
|------------------|---------------|------------|-------------|
| 20000.00        | 28%           | 45%        | 34600.00    |
| 30000.00        | 28%           | 45%        | 51900.00    |
| 40000.00        | 28%           | 45%        | 69200.00    |
| 50000.00        | 28%           | 45%        | 86500.00    |
---
**Exercício 5:**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Salario fixo: ");
		double salarioFix = sc.nextDouble();
		System.out.print("Carros vendidos: ");
		int carros = sc.nextInt();
		System.out.print("Valor por carro: ");
		double porCarro = sc.nextDouble();
		
		porCarro *= carros;
		double novoSalario = salarioFix + porCarro + (porCarro/100.0*5.0);
		System.out.printf("Novo salario: $%.2f%n", novoSalario);
		
		sc.close();	}

}

```
| Salário Fixo | Carros Vendidos | Valor por Carro | Comissão (5%) | Novo Salário |
|-------------|----------------|----------------|--------------|-------------|
| 2000.00     | 5              | 10000.00       | 5000.00      | 17000.00    |
| 2500.00     | 3              | 8000.00        | 1200.00      | 14900.00    |
| 3000.00     | 7              | 12000.00       | 4200.00      | 39900.00    |
| 1800.00     | 4              | 15000.00       | 3000.00      | 22800.00    |

---
**Exercício 6:**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Fahrenheit: ");
		double f = sc.nextDouble();
		double c = (f - 32.0) * 5.0/9.0;
		
		System.out.printf("Celsius: %.1f%n", c);
		
		
		sc.close();	}

}

```
| Fahrenheit (°F) | Celsius (°C) |
|----------------|--------------|
| 32.0          | 0.0          |
| 50.0          | 10.0         |
| 68.0          | 20.0         |
| 86.0          | 30.0         |
| 104.0         | 40.0         |
| 122.0         | 50.0         |

---
**Exercício 7:**
```java
    package tarefa1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor: ");
		int value = sc.nextInt();
		
		if (value>10) {
			System.out.println("Maior que 10!");
		}
		else if(value == 10) {
			System.out.println("IGUAL 10!");
		}
		else {
			System.out.println("Menor que 10!");
		}
		sc.close();	}

}

```
| Valor | Resultado        |
|-------|------------------|
| 15    | Maior que 10!    |
| 10    | IGUAL 10!        |
| 5     | Menor que 10!    |
| 0     | Menor que 10!    |
| 25    | Maior que 10!    |
---
**Exercício 8:**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor: ");
		int value = sc.nextInt();
		
		if (value>0) {
			System.out.println("Positivo!");
		}
		else {
			System.out.println("Negativo!");
		}
		sc.close();	}

}

```
| Valor | Resultado  |
|-------|-----------|
| 10    | Positivo! |
| -5    | Negativo! |
| 0     | Negativo! |
| 25    | Positivo! |
| -12   | Negativo! |

---
**Exercício 9:**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Maçãs: ");
		double  maca = sc.nextDouble();
		
		if (maca<12) {
			maca *= 1.30; 
		}
		
		System.out.printf("Custo total: %.2f%n", maca);
		
		sc.close();	
	}

}
```
| Quantidade de Maçãs | Preço Unitário | Custo Total |
|---------------------|---------------|-------------|
| 5                  | R$1.30        | R$6.50      |
| 10                 | R$1.30        | R$13.00     |
| 12                 | R$1.00        | R$12.00     |
| 20                 | R$1.00        | R$20.00     |
---
**Exercício 10**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		System.out.println();
		if (media >= 6) {
			System.out.println("Aluno aprovado");
		}
		else {
			System.out.println("Aluno reprovado");
		}
		
		System.out.printf("Media: %.2f", media);
			
		sc.close();
		
	}
}	

```
| Nota 1 | Nota 2 | Média | Resultado       |
|--------|--------|-------|----------------|
| 7.0    | 8.0    | 7.50  | Aluno aprovado |
| 5.0    | 6.0    | 5.50  | Aluno reprovado |
| 9.0    | 6.0    | 7.50  | Aluno aprovado |
| 4
---
**Exercício 11**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ano atual: ");
		int currentY = sc.nextInt();
		System.out.println("Ano nascimento: ");
		int birthY = sc.nextInt();
		
		int age = currentY - birthY;
		
		if(age< 16) {
			System.out.println("Não pode votar");
		}
		else {
			System.out.println("Pode votar");
		}
		sc.close();
	}	
}
```
| Ano Atual | Ano de Nascimento | Idade | Resultado       |
|-----------|------------------|-------|----------------|
| 2025      | 2010             | 15    | Não pode votar |
| 2025      | 2008             | 17    | Pode votar     |
| 2025      | 2005             | 20    | Pode votar     |
| 2025      | 2012             | 13    | Não pode votar |
| 2025      | 1990             | 35    | Pode votar     |

---
**Exercício 12:**
```java
package tarefa1;

import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Valor 1: ");
		int valor1 = sc.nextInt();
		System.out.println("valor 2: ");
		int valor2 = sc.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("Maior: "+ valor1);
		}
		else {
			System.out.println("Maior: "+ valor2);
		}
		sc.close();
			
	}
}
```
| Valor 1 | Valor 2 | Maior Valor |
|---------|---------|-------------|
| 10      | 5       | 10          |
| 7       | 12      | 12          |
| 20      | 20      | 20          |
| 30      | 15      | 30          |
| 8       | 25      | 25          |

---
**Exercício 13:**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Valor 1: ");
		int valor1 = sc.nextInt();
		System.out.println("valor 2: ");
		int valor2 = sc.nextInt();
		
		if(valor1 > valor2) {
			System.out.println(valor2 + ", " + valor1);
		}
		else {
			System.out.println(valor1 + ", " + valor2);
		}
		sc.close();
	}
}
```
| Valor 1 | Valor 2 | Ordem Crescente |
|---------|---------|----------------|
| 10      | 5       | 5, 10          |
| 7       | 12      | 7, 12          |
| 20      | 20      | 20, 20         |
| 30      | 15      | 15, 30         |
| 8       | 25      | 8, 25          |

---
**Exercício 14:**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Hora de inicio: ");	
		int inicio = sc.nextInt();
		System.out.print("Fim: ");
		int fim = sc.nextInt();
		
		int duracao;
		if(inicio>fim) {
			duracao = fim - inicio;
		}
		else {
			duracao = fim - inicio + 24;
		}
		
		System.out.println("Duração: "+ duracao+"h");
		sc.close();
	}
}
```
| Hora de Início | Hora de Fim | Duração |
|---------------|------------|---------|
| 10           | 18         | 8h      |
| 22           | 6          | 8h      |
| 0            | 12         | 12h     |
| 15           | 3          | 12h     |
| 8            | 8          | 24h     |

---
**Exercício 15:**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Horas trabalhadas: ");
		int horasTrab = sc.nextInt();
		System.out.print("Salário por hora: ");
		double salarioHr = sc.nextDouble();
		
		double salarioTot = 0;
		
		System.out.println();
		System.out.println("Hora extra [s/n]: ");
		String resposta = sc.next();
		if (resposta.equals("s")) {
			System.out.print("Quantas horas extras: ");
			int horaExtra = sc.nextInt();
			
			salarioTot = horasTrab * salarioHr +(salarioHr*50/100 * horaExtra);
		}
		else {
			salarioTot = horasTrab * salarioHr;
		}
		System.out.println();
		System.out.printf("Salário total: $%.2f", salarioTot);
		
		sc.close();
	}
}
```
| Horas Trabalhadas | Salário por Hora | Hora Extra? | Horas Extras | Salário Total |
|------------------|-----------------|------------|--------------|--------------|
| 40              | 10.00           | Não        | 0            | $400.00      |
| 35              | 15.00           | Sim        | 5            | $600.00      |
| 50              | 20.00           | Sim        | 10           | $1300.00     |
| 30              | 12.00           | Não        | 0            | $360.00      |
| 45              | 18.00           | Sim        | 3            | $891.00      |

---

**Exercício 16**
```java
package tarefa1;

public class Exercicio16 {
	public static void main(String[]args) {
		double gastoJaneiro = 15000.0;
		double gastoFevereiro = 23000.0;
		double gastoMarco = 17000.0;
		
		double totalGasto = gastoJaneiro + gastoFevereiro + gastoMarco;
		double mediaGastos = totalGasto/3;
		
		System.out.printf("Gasto Janeiro: $%.2f%nGasto Fevereiro: $%.2f%nGasto Março: $%.2f%nTotal gasto: $%.2f%nMedia gastos: $%.2f",
				gastoJaneiro, gastoFevereiro, gastoMarco, totalGasto, mediaGastos);
	}
}

```
| Mês       | Gasto ($)  |
|-----------|-----------|
| Janeiro   | 15000.00  |
| Fevereiro | 23000.00  |
| Março     | 17000.00  |
| **Total** | 55000.00

---
**Exercício 17**
```java
package tarefa1;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Digite a nota da P1: ");
        double P1 = sc.nextDouble();

        System.out.print("Digite a nota do Exercício 1 (E1): ");
        double E1 = sc.nextDouble();

        System.out.print("Digite a nota do Exercício 2 (E2): ");
        double E2 = sc.nextDouble();

        System.out.print("Digite a nota da API: ");
        double API = sc.nextDouble();

        System.out.print("Digite a nota da SUB (caso não tenha, insira 0): ");
        double SUB = sc.nextDouble();

        System.out.print("Digite o valor de X (caso não tenha, insira 0): ");
        double X = sc.nextDouble();

        double M1 = (P1 * 0.6) + ((E1 + E2) / 2) * 0.4;
        
        double apiBonus = 0;
        if (M1 > 5.9) {
        	apiBonus = (API * 0.5);
        }
	        
        double mediaFinal = (M1 * 0.5) + apiBonus + X + (SUB * 0.3);
	        
        System.out.printf("A média final do aluno é: %.2f\n", mediaFinal);
        sc.close();
	}

}

```
| P1  | E1  | E2  | API  | SUB  | X  | M1   | Média Final |
|-----|-----|-----|------|------|----|------|-------------|
| 7.0 | 8.0 | 9.0 | 6.0  | 0.0  | 0  | 7.4  | 5.7         |
| 5.0 | 6.0 | 7.0 | 8.0  | 0.0  | 0  | 5.2  | 3.1         |
| 8.5 | 9.0 | 9.5 | 10.0 | 0.0  | 0  | 8.7  | 6.8         |
| 4.0 | 5.0 | 6.0 | 7.0  | 6.0  | 2  | 4.6  | 6.2         |
| 6.0 | 7.0 | 8.0 | 9.0  | 0.0  | 1  | 6.8  | 5.9         |

---