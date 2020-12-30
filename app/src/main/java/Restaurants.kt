import com.example.advancedsoftwareproject.MenuItem
import com.example.advancedsoftwareproject.ui.foodData.Food

class Restaurants {
    var foodData = arrayListOf<Food>()
    var menuBurger = arrayListOf<MenuItem>()
    var menuPizza = arrayListOf<MenuItem>()
    companion object{
        var menuPos : Int = -1
        var isPiz:Boolean = false


    }

    private fun setMenuBurger(){
        menuBurger.add(MenuItem(
            "Bacon Mushroom Jack",
            "102",
            2349
        ))
        menuBurger.add(MenuItem(
            "Charbroiled",
            "92",
            1177
        ))
        menuBurger.add(MenuItem(
            "HitchHiker",
            "67",
            1077
        ))
        menuBurger.add(MenuItem(
            "Old School",
            "86",
            1017
        ))
        menuBurger.add(MenuItem(
            "Shitake Mushroom",
            "64",
            808
        ))

    }
    private fun setMenuPizza(){
        menuPizza.add(MenuItem(
            "Chicken Ranch Pizza",
            "158",
            2349
        ))
        menuPizza.add(MenuItem(
            "Smoky Cheese Pizza",
            "92",
            1177
        ))
        menuPizza.add(MenuItem(
            "Pepperoni Pizza",
            "67",
            1077
        ))
        menuPizza.add(MenuItem(
            "Sea Food Pizza",
            "86",
            1017
        ))
        menuPizza.add(MenuItem(
            "Cheese Lovers Pizza",
            "64",
            808
        ))
        menuPizza.add(MenuItem(
            "Chicken BBQ Pizza",
            "98",
            651
        ))
        menuPizza.add(MenuItem(
            "Margherita Pizza",
            "41",
            620
        ))
        menuPizza.add(MenuItem(
            "Super Supreme Pizza",
            "78",
            208
        ))

    }
    fun setData(){
        setMenuBurger()
        setMenuPizza()
        foodData.add(Food("Papa Johns Pizza"," Nasr city Genena mall", 4.7f,4562,"9am-10pm",
            "https://www.egycareers.com/wp-content/uploads/2020/10/papa-john-s-azerbaijan.jpg","19277",menuPizza))
        foodData.add(Food("Pizza King","Abbasia Square - near the bus stop and Misr Tourism Tower", 3.9f,5932,"9am-10pm",
            "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxASEhUSEhIVFRUVFRUVFxUYFxIWGhcYFxgWFhUVFhcYHighGR0lGxcVITEhJSkrLi4uGCAzODMtNyotLis" +
                    "BCgoKDg0OGxAQGy0lICUtLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIALQBGAMBEQACEQEDEQH/xAAcAAEAAgIDAQAAAAAAAAAAAAAABQcEBgE" +
                    "CAwj/xABHEAABAwICBgUJAwkHBQAAAAABAAIDBBEFIQYHEjFBURMiYXGBFCMyQlKRobHBYqLRM0Nyc4KSk7LhFSRTVGODwiWk0vDx/8QAGwEBAAIDAQEAAAAAAAAAAAAAAAQFAQIDBgf/xAAwEQACAg" +
                    "IBAwIFAwQCAwAAAAAAAQIDBBESBSExE0EiMlFhcRQzgQYjQrFSkSQ0of/aAAwDAQACEQMRAD8AvFAEAQBAEAQBAEAQBAEAQBAEBwgPOeoYwXe5rRzcQB8U034MbRHv0koRvq6f+LH8rrZQk/Y15x+oZpLQH" +
                    "dV0/wDFj/FHCS9hzj9TPp6qOQXje145tcHD4LGmvJsmmeqwZF0BygCAIAgCAIAgCAIAgCAIAgCAIAgCAIAgCAIAgCAIAgCAi8b0gpaRu1UStZfc293O/RaMyt4wlLwjSdkYLuyucb1vEktpKfL/ABJSfhG36n" +
                    "wUuGG/MiHPNXiJpeJaZYlUenUvaPZjPRj7tj8VJjjwj7ESeVN+WQMkRcS53WJ9Z3WJ7yc124nF3P6joVnRrzOpYsGVI6NFiHDIjcRkR3ELHFP2N1Nr3J7DdMcRgI6OpksPVeekHd11ylRCXlHWOROPublgmt6U" +
                    "ECqgDx7cR2XeLHZH3hR54f8AxZJhmf8AJFj4BpRR1gvBKC4b2Hqvb3tOfioc6pQ8omQtjPwTN1odDlAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAEAQBAeNTUsja58jmta0Xc5xAAHMkok29Iw2ktsqrS/Wi8l0NCLD" +
                    "cZ3DM/q2nd3n3cVPpxPeRAvzNdolcyiWVxfI5z3O9JziST3kqwjWktIq7Mjflnqyh5rpwIzvPXoWhZ1o15yZ4yPaFr2N4xZjyShatnWMWeDnrVs6pHmVg2OEAQGZh1LM9wdCHbTMw5uWyew8Co1+RVV2m/JLx8a63" +
                    "vWvBv2iWtGWIiGtBkYMulHptz9YeuO3f3rjPGUlygdoZLi+My3sProp42yxPa9jhcOaQQf69ihNNeScmmZKwZCAIAgCAIAgCAIAgCAIAgCAIAgCAIAgCAwcZxSGlhdNM8NY0b+JPBrRxJ5LaMXJ6RrOaitsovS3Suox" +
                    "F9jdkDT1IgeW5z/ad8B8Va0Yyj+SmycxyeiNpcP4lTo1lTZkma6JrAt9JEdTcmYFTWDguUrEkSqaHJmPikEsRAeLbTdofUd4UKjMrv3wfgtb+nzx9cl5I4uXfZw0cLBsbZovo02WMvkHpAht+A9rx4LznU+qSrtUK34" +
                    "8npOm9MjOlzsXd+DWa2ldFI6N29pI/A+II96vce+N1amvcosin0rHB+x4LuRzKw6hdM8MaMzvPADiSouVlQx63ORLxMWWRNRivyWfhOFsp49kDcPpmV4e/KnkXKUvqe1qojRTxivYqmU5nvPzXvaV8CX2PCX" +
                    "Pc3+Sb0T0qqKCTajO0xxu+Inqu7R7Lu1YtpViNqbnB/Yv7RzHoK2ETQuuNzm+sx3FrhwKq5wcHplrXYpraJVaHQIAgCAIAgCAIAgCAIAgCAIAgCAIAgMeurI4Y3SyODWMaXOcdwAWYrb0jWTUVtlB6WaSS4" +
                    "lPtG7YWE9FHyHtOHtH4DJW+PjqC+5SZeVyf2OlBQgBT4wKO29tknVQFse2Bcb8lWrqkI5Don2ft9y0fRpzxo5Fb2vdfQ1StrS471MlP6HKqjiMDpjNPG3htAnubn/TxVb1G/0qJSLjpuP6t8Ym/wCk2D9PAWtFnM" +
                    "F2943jxF15DpuY6L034fk9Z1HEV9LXuvBV9ju+HzXvE01s8RJNPTJTR3CzUSgEdRti76DxVb1PNWPV28vwWPTMN5Fu34RacEQa3ZG5eEsm5PbPapaWkaVrAw2xbO0b7Nd/xP0Xp+g5fml/wec63jdlcvwzUKeFz3BrRc" +
                    "k2XorbY1xcpex5+mqVk1GPuWbo1grYGc3HMu/BeF6hnSybN+y8Ht8LDjjV8V59yWqjZjjya75FQ6FuyP5RJuf9uX4KYvdfSktLR87k9tsJ7GpNaKaRzUE4ljzabCSPg9vLvGdj/VcrqlYtHem11s+icGxSKqhZPC7aY8XHMHi" +
                    "0jgQciFVTi4vTLeElJbRnLU2CAIAgCAIAgCAIAgCAIAgCAIAgOCgKb1qaTGebyOJ14oyDIR68g9Xub878lZYlHbkyqzsjXwo1vDqQb1aQjo83fdtmdVVAYF0b0R6q3ORKaI1Qlie057LyPAgH8V4P+oY8clTX0PpX9Ov/AMXg/qQm" +
                    "lOjJbeWEEje5gHxb+CldL6vvVVv8M06n0rzZV/0emr+izfKR9kfX5hadfyE+Naf3NuiUNJ2P8G8kLy/g9EVzpfg5ZUAxj8sch9rLat2cfevZdJzuWO+b+U8n1PCf6hcP8jb9G8KFPEG8Tm48zxXm+oZbyLXL29j0OHjKipRX8kuoPglmJilE2aJ8bvWFvwPgc/BSMW51Wxmjhk1K2twfuazoThLRtvd6bHuYQd7SOHjvVx1nMnPil8rWys6Tiwq5N/NvRuBIC89yRdJEfjVVswSkcGP+S74T5ZEV9zjl/DTJ/YqQL6UfO2EAQG8artKzSTiGR3mJiAb+pJua+/AHce8HgbxMmrkuS8k3Fu4viy+AVWlmcoAgCAIAgCAIAgCAIAgCAIAgCA1zTzHvI6R8jSOkd5uIH23bnW42Fz4LtTXzno4X2+nDZR2HQEm5uScyTvJO8kq9rjo8tk2kyXhjVI8Fak5M13EqwuNlGnItselJExq/qrTPZf0m38W//V5n+oKuVSmvY9X0G7jY4M39zQV5DevB6ryREkDqcl8TS5hN3x8eZczt4k" +
                    "bj2FTo2RvXCzz7MiSg6m5QXb3Rnw10T4+la8FliSeWz6QPIjiOC4Sx7IzUGu51V8JQ5b7EHhEJqZjVPHVPViB9Vntd7jc+KsMu1UVLHh/P5ImLB22PIl/H4NlsAqhllo6mQc1q5IzpnR0wWvqGVE1uokNPVh+5lQNh/Y8CzCfgFcVN5eG4f5R7r8FXZ/42Spf4y7P8k6qJluiL0mfs0sp5tt+8Q36qy6RHlmRRX9VlxxZMrNfRzwAQHIQAhY0ZTL91XaReV0ga915YLRvvvIHoPPeOPMFVWRXxn2LfHs5wNzXAkBAEAQBAEAQBAEAQBAEAQBAEBSutbFTPWtgaepTtt3yPzcfBuyPerTCr0uRTdRu78SHpGWCtEtI83bJtmDitXwWk5EnGq2QD3XKjss0tIkNHano6mJ32tk9zsvqFX9Tq9XFnFFj0yzhkxZaXTHsXzp2Pej3vFHBlPYseqxxRrmP4Y7Ze+IkA2MjNzZA0g58jla6u+nZ3KSrsXf2f0KrOxNR5w/lfUlcIrGyRMfHcNcN3KxII8LKtzq7Kr5Rm+5OxbIW1KUV2My6h7JOkcLACAjtIKHpoXNHpDrNP2hmFYdMyPRvTfh9n/JDzqPVpaXnycaP4h00LXH029V4+0Mv6+Kz1TF9C9peH3Rr0+/1aVvyvJiaaPtSuHtOYPvbX0UvoEN5if0TI3W5axGvx/srxe+PDhActQHoAs6Ndm1arsX8mr2AmzJh0TuWebHd4cAP2iouTDlD8EzFs4z0fQQVWWwQBAEAQBAEAQBAEAQBAEAQHlVTNYxz3GzWtLieQAuSspbejDekfODKh08r5nelI9zz2bRuB4D" +
                    "LwV/THitHl8yzbbJGZ2y1SG+xVxXKRrlbLcqNJ7LeqGkYi1Oxy0kG43haTjyi0b1y4yTRbFDOJI2PB9JoPwXzDLr9K6UfufRsez1Koy+x51+JQwC8jwOTfWPcAumNgXXy1CLOd+ZTRHc2alW6QtqX9G8mKDjYHad+kRuHYF6ino8sSvnBcp/6PPT6pHJtUJPjD/Zt2GmLYAic1zeGyQR3ZLy+XC/1G7E9no6LKXBKtrRlKGSBdAEAW0U2+xhta7mp4bUthr5ImkFklz3PA2j/yHiF6nLolf0+Nkl8Uf+2eexr41Z0oRfaX/wAZzp3VN6NkYcN" +
                    "ra2iL5gAEZ+JWP6dxZqyVklo169kQdahFmlL2B5QIAEBkxNWyOUno6FzmkOabOaQWnkQbg+8LWS32OlctPZ9OYFiAqKeGcfnI2PtyuASPAqknHjJovoS5RTM9am4QBAEAQBAEAQBAEAQBAEBresWp6PDqk8XRmP8AiEMPwJXWhbsRxveq2" +
                    "Uhhjclf1o8nkPuemJy2C2mzTHhtmvyG6jFokdUMhDJIxY3UtjETZC1g5AA9196r59Nx52OyUdtk2PUb41quMtJGDJIXElxJJ4nM+9TYVwitRIs7JTe5HVbGh3hmcw3a4tPYSFzsphNaktnSF04P4W0SUOklW3dKT+kGu+YuoNnR8Sf+GibDq2" +
                    "TFa5bMkaX1nOP9z+qjP+n8Tfhkhddykvb/AKPOTSqsP5wN7mN+oK3h0PEj7Gk+tZT90YNRik8npyvd4kfKym14OPX8sERLM6+z5pMw1L0taI3J72LprXgw5N+ThZNQgAQGdStut4kex6OlUyySRtVIvHVFV7eHMBP5N72eAdcfNU+StWF9jPda" +
                    "N1UckBAEAQBAEAQBAEAQBAEAQGja4pLYeR7UsY+N/opOIv7hFzH/AG2VTh+5XsPB5W/yYmKvWljO2MiJXAnFiaLas21dLHUGoczpLnZDAbWcQMyexQ7MpxlrROrxVKO9kmNUcBJa2tJc3eNlht3gG4Wv6x+6On6KP1NO0v0JqcPs55EkTjYStuA" +
                    "D7L27wffey71ZCn29yNbjuvub7o5q1w+elp53iXbkhY91pCAS5oJyIyUazJnGTSJdePBwTZVNbR+fljhY5wbJI1oALjstcRnYfFToz+FNkCUPiaR5nDpx+Zl/hv8AwTnH6mPTl9DgYfP/AIMv7kn4Jzj9R6cvoTuiOE0pnIxImCHo3FrpHOhBku2" +
                    "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"
                    ,"19519",menuPizza))
        foodData.add(Food("Buffalo Burger","27 Nasr Street New Maadi", 4.9f,1287,"11am-10pm",
            "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAABelBMVEUAAAD////taAl9fX34+PgAAAbQ0ND19fUAAAPp6emvr6/Dw8" +
                    "Py8vIyMjLIyMgAAAnh4eFdXV0QEBBwcHBTU1Pa2tpLS0uIiIgAAA64uLgpKSmfn58AAwDm5uZlZWWbm5sgICDV1dXxZwYYGBhAQEDnawvwaASlpaUJAAD3ZgCSkp" +
                    "J1dXUxMTFQUFAAABPuagCbTR7ibR7lbwDrbB0AABo5GA1XJxdPKRItFwxcLhixZCjYbiXkbhWuWSZFIhCTRSRsOh+RTiR0Pxp+QigaAAG+XiKURhmxXRnYcCvHaD" +
                    "IYDA4uDQnHYCgnDRr2YxqWViY/Gw6xWi88Ih/DaiIuABFyMhWfRiQzDQo8FAZyNyiGPiXqaCZBFhp8OxZZJQ/aaC1kQDVONTBZKgrPcyFULxZrOyYpHB1IKxp5NR0" +
                    "mAAAXEx2dQRy7akfTbTnLXSGfUAVuPz+9aTjOTxB+UDZMOyGTVkigQzHBVTFEFwA2HQ1iPRxaIRY+GwDxYCRQxibxAAAROklEQVR4nO2c+1vbyLnHx2PLyGAi7ggw" +
                    "twkSHkOQhWICkQyGYGoDJSGpmyWscZYmG9Jt6dme0z3Z0v3f+85IsmXHJiZhH2ye+f5AfJM0n5l33pvlICQkJCQkJCQkJCQkJCQkJCQkJCQkJCQkJCQkJCQkJCQkJ" +
                    "CQkJCQkJHSfJcvyXQ/hd9R9ZnMlSdL9hpSkhIQya0/WwVSRcu9YZSQrkrzx1LYcO7sJhMm7HtGtKwELuGVRqlNK7Rw8Ve56RLesJFjl9irB2MImJuYOLOldD+kWxb" +
                    "acnEBpfIQ1nRo6IZg844Z7fzajLCu7WQvr2Mxvl/MmwRbZg215fwhlCal/sAjRChdIVZWDPNGotXef/CkDXD3CuLiJNvL59L6axRrGW/cjBeAQ0sGhrlEn+0cpbRJ" +
                    "C8wcrWWIcWc8VlLjr8d2CZFmSMkVi6tY2ysBeBHeKiwfS8dGqRZ+qkiLd9QC/WbAHXxQJ0a0d9UOBUgZIcfFPiWOCtdVjJCW6fhkl9LJCiONcoDWb6hbWDMb46k/S" +
                    "McaE5Lt7K0IWk1DkDzZdpU5JOXHY+nkixY/qlgOwT/dVlOhezCRS1HcmtYhVWslZOg6qeID+DAnAUX69i/cihHSlbFJNPz1Xzy1DC/BpFOdfo20LU734ndSdhAlZU" +
                    "lR0AhsPm2doA0BJwEo1Dev5A5S2NAgeLxTwNt3ncCAlS6A3Fsa6uYHen2IMa0gA0qhhHmaUNHM3rzKoG5dRScgyVEuabm4qJ6fUwDoxTNONh650+vfv5Z80MNjK90juvn" +
                    "qRlYNkVaOFTaXE9iLWnHRm/0nWrCJqhmZnVvYcTIzCJlhpN9mpBCuyIqU12Hr2d2rZwgbRiFWWVlQFnRU0jxFqKL3ynbplaZjapZWuqvpZniJDhqYRex3tWIzIsCDRTkL4UD5" +
                    "e0oBThdXbggRu1SwpajeFRUWF8oESam6ulDU3SqRXeCEsJ9Urs+ptwJMWrtAbkxLNzKlq96wiq3d15kXX0J7JA72e3/2RjT8JebicDUZ+3T5DJw7VsLXTNY2NJFRLeR3in/1O3YO4" +
                    "BytGje23b394iFgiLkOpQWETegmAblQ2lZyzSmGjqqgrVlFWpfWnsCTU2kBbjsYcCra29wMfQJlt0yLUzwBI4QkqWatwSBkpyS5glKRfX2HqUCunPsOUEeqFHTVYz0uqsr+Zh5UlbgJH" +
                    "7Qu1xPbi6VZ3hIx1m0KsM8+kMqyjDoTmE4l1neTq6JlLRTuOTrwEznBKjzdssGvrF9TxyU1SXbMN6hDnTN1j1YTzmwGlYeOw2Y6EXJVoWHOTHJiED7a+SrTnktTZ6Y2Mzm3DYLmouo1Z3" +
                    "HPeWOYBkuuNr38S/iSUcxN7FRXRC2to02blRxqtdDKhjEo27C5qvWM5tQNjPzr5889JlKwnnGV/oCq8+ovlxQzTtN9JZyxQkmyyYyM/6+++N5mHPGUmSnlNT59KP+6jwKAXJnqnU/wR7" +
                    "MUXh27McC6y1F6T1woUkp9sUupMfyNBRfjM1IlGoVxKV7MWSEfr1iQcCvXVnh3YBpRPeAtliWFvoDUbYgs5VjqzmJJUVLagAmQRvAoIG634tm5fPQwP1p7IMBW6jq2Dx3uQuhZO0AdWK" +
                    "ev5P6504iom1C2NEt2he0q2mrFgffv6mqFkAaG2r/yBTcbpBUobjq6R4sdO3IsrexoDI07l0gFT9QArH5F08rJ1NrYBlYem/XXTZgfoZv6UEEjptKe7SuclqesV8IS6ztYx2JAxCzb+a" +
                    "VdtfkxSKcEBNJss8u6Grh3pGqtFdKcsdV69uA1Tz8J3/jJYOmg6hX32t93mxyTktb/b2ZPvi4RqvCY2Lk2dJXPkENaw0yw1T4im48rlxtalVccIhnvSwjcmpP3vMxvZavPGzL9/VtS4P3" +
                    "4pdRzhIaQymEA6+vhNgI/oWCf/+J8WVoqknG1yj+vKukDowoLKS7c7kDBNuZX+bfegQnC9zl++bXXUth5ohRN6vL/7M1tRau93nqd5Z+kOhOt/VoqX9Xy6uYv+N9niG+3nJECo4X9eFi" +
                    "8NDE45jTqPUDlmTTTNIlqgJ8oJ84r8f+tNbS4pbQc6xIyMdQRgnuxMJ3Ztdo/dlowOLqf2HQV4nzeK/OPbH5Cy/8O+n6rA8H94qSYUeT1g0gZxNMiJMDk63ejEtC2pfDzmrYnDS0yrDU" +
                    "MdCLfAQk/+9eH9v97uJqofTmbz+4oio+PAGjrkl3NI/KD26sgaMSlJH7Pg6fGFum1XF4YZ7htWduyuv1xPVr9HS6pPoE7KSLJUI9Q16yflRIMU/FzqQBOF2JZE0m5W00h+XSpbpEpIrDP" +
                    "J/2opsBfTYMzF14qc9z2Nplt76jsLH0HA6dx+lCTlsaEfZtCO5e9Eg9ofEWeTUa3Wl0/Yojlpad2uuZk9ZQOqL/O8E/egr4S8n3UoOTxQc46ha677sF+zt6DkU+Sk5AUN9ZB14fQCunLz" +
                    "H3Yn2JZ6YlJIGTq6iwExI/n/1iopHqCcSXV3afgaKmrm509KAtJpPn7F5F8Jm+iCuLasgYmWIKmxz+WO3IO+ZCSvoOyRRioH6g7/egKio/kWJZMr/ynQy9fSCnpzgqSEsmaxfE4zUZnwF" +
                    "dTMMhRS+Mg6V+VkJ1a/QUnJLFSHxddyyYbACDFcKyEVvS4CbHFXea5dZiBb2WJfCeu6rey4XhSXJXYrg3l+16NvR5KkZB1CX63LOf5tKDVfSFdpk/W+SXrnyNCKGfXA1lmrFAjXWENOs8" +
                    "qPy6aum+dqJ3sZTzJjTMPwL38FQ2ULdKzuWCzRYdvN0nlLdFvn9aCWRTlMDM0qqSWTGIWzzuxANZGcTENa82pTeWYZlDWmiP9FE991wMVvzCDWplSyqOWUwC9hcrrRRbdjKsnnDiGVd" +
                    "+ji1Ej/NVf3rS/W9x4jdscC5HPl0iXbg2quQGhlo+MKwmukqPKxpRunL9CVY/3WUGwYeemEFb2wrpZDdKf8uASRpXCmdF5npqUSSJKVtIUN84NasnTcgEjBJA3srqJu7sAexLSwBoCdHibq" +
                    "JbPWFLXPeL+woWL08zQNUyenbpjYqKzd9XhvLklB2xZlWSZLNpsBQjzUzQv5rED0ymYXbUFfSYbI8sz36Lyg680ICT7dQFcVSE835W4JE0ElkKLsWavU+TeUDLSZoTIbPoM9WblCnVsuX" +
                    "S8Z7VmQfObQO3PV+HwJzQ0WB43KVTcuoCtJRVsQ262ckrG1ekQCheBLtGVCRvCkiwJ9o2QoB7cBxy6hFxDT6wg1ew2VTYOAF+28vuFNJCs7lkNxTvlPxfBa2+wGG90oXClli7KcrvPLpW" +
                    "sFW6ysaY51gV5UsLeKq7q2WvmEtqBUtrswDjZISqjyG+dIc36RPhVcf0oMik9fymWH0sKn7v/drAyhH2CgjtiTPhQ8QmJn2F3sRuXTPfn5msLuMXXwtvqdzfunhr2p7rGflWx2t4+pCaI" +
                    "BQyR7Kwc2u+v0cJNnO4XNux7YrUlBK+g9JY72DzWTzmfL+xBCCC68UO/LEiIpCav4HqooK8uzl/0stmjh1+79qUxTJVDOMjD5S7pcPjapRiuZe+FiAlIeS7lTY5VCNUwhWhRedH+YaBC7" +
                    "sy33G+tcQGlPzIx0b/agL5ndqbfB7geCeHG4fj/C4GeSwZUempXDrbu7p2t0PjrRO5UaD8+M/Q5nTyRWVLS/vq78DolMYnJhhI95aKJ3PLzYcvihmmIL7IXh+MD8FByWGl8aHPrWUcj" +
                    "sNzMyuqX/SWFuYWR4fJw9isbikQgbc5Q9mxkOR6MjrY6KBBDjc4jfDBqaB0L2Qj9CsdhotG9icSo1A6/dnDiZYP4lib7q/8QYGU+l/IEvVteBDSJeHfMEI5wJjy21JAwF1esRwswMRVz" +
                    "C6gyMItQbCkXijLiPTcXyyEL/5NzDmw+8qeYm+8cGh8dnw/4s9j9wr9uzxJ/2+uOYricMLXzpzKOxwKd75j4j7PHfmw/MI3sDPajNChzV29s7fiOiweFwmJ0lOj+/jNBYba/08/eXa8M" +
                    "avJZw9svXegQfG1gK97GPj92AcKD6uof7IHDO1GIqPBwwnIVB2Cypqd6JB30z/IVhNljEbainP0jonaav9kK0jjDGrIaNamppOFZ/1esIR72jPiesztZoI2HMfThQHVDtWv5wpof9V6" +
                    "K1AYemfMKBpoQRdnLuBuKpFLt8/KF3ynj0Qd/E1JA31hF3QNEvE454hAMtCWdHBgdnvBPGJx5Eo6NgV3MeO3dP9YSzteHOeC89CBDyFxsI2TRHxoeX/LfHvAeD7N9Jj7A2hYxw8MaEoy0" +
                    "Jw94nF6tLxsYAHxgY9daznnCg0eT8NYyN8rd6mxOyuWLvs/084z2fbE4Y+R0Jp/3D2OzOjrvHNBAy++1bGIwHrj/Cnz1CaCLkevhmhJPuINhPM5Z8wtj0QNS30m8lbG2lTQnZGMbZVA8" +
                    "3JQy7MLXrx92tM9uccMQjZIOYDRBWdRuEMdceGghjrQhT7I0xb0CfE467r30NYXUNJ2+XcMz7dLuE7JKD/d54b0a4+GVC9nZPI2HthzcBwjaiBSdcmIq7B11HOBUkZL5jYc6/RHuEgy7h" +
                    "4FcSDoynZqemHtYIB0J+xvFFQjeN5R9uQjj76NHYWL9P6KVV7OxDQ3HPu7ZNOOEuYSPhoEc47flS9nakkZArsuwRPhrhjjnwg6PrCF3FFz4nnPbfjLqEkTioZxkNsTc4Z89Q24Qjg72RU" +
                    "Hy5FeFDfoXqEkfmhtnF4gO+L3UHOekRuiOb/zJggJAbeivCeZfQVT/q7+GE8yE3XLVH6KaAvDpoRrjI06RRfwIic0vu1ebq1tAndHn72yac5ws01zYhc0wxN1dZaJvQk2+GDYQBQ/LXs" +
                    "J4wHo1C3jaHAhVRO0vICaeX3Y218BlhNT8ZrSeccU/PYt7SDQir+70loftTTHcfLiz2evPe4Etr8zHXJmHrnIYRTs2ARlzC2MwwaIgHrD7XX0+1TdgXTrCRNomHNcL5ACFUicE1rAUGPl" +
                    "m8/GjD0bRBGIwWfl7qRe6UN+D2CMdaRnxmEqEBZvNujPAJF1oTLvHdmPpmwtFQ83jIzDM+zcvnB20Tts5p3Eybr1jYJ+zxCT/PvN3Vi4baCvhfSRgo+KZviRBi0IB/mpl2CJkBxdpoo3w" +
                    "d4WiNMHRLhJEF/i53Hn71dC0hX/I2mqBfRfgwFiAcak54k9rCI3zITjfsEbLluZaQn7ON7tD11VMLwuWI+7o/jbdEyI2/zyNkPafrCet7J9cSzqOqs2uPkF8ZBtzPPrZUvdZYajz8LVbK" +
                    "r87ysvYI2adjX27islA0MDaSCtURIo9wvjkhj1/LnrVOVQnhJPGvqoBn/C3lzRgvB5YbCKP9/cuTDwOEc+1sxKFgv5TlNOzSsbHJsIfQgpBnjOzBqDtij3Ccp3Ie9fxnhGPuSK8jnHBPx" +
                    "PszE+6EVHMa9jg+P1QjrDY9riUM8PG+3YL7KOTRtCDkTo89iLoYjDDCw2PMzWUjAzyj9Q2rl0eX0Wg04hEyhMjEbF/AKlkbx226zXm9yul5/jeBgv3SIGF9LtcGIW9I1DplvR5BE0I21" +
                    "bwIYEOMBRu4dU+qEzwdCjW8WOsvMifArX7Ev3yYW4Mv3kSo73n7hMPuBdsmdCd8uLqik60JH4SCvegGwuXalx2+GwgS8plBk/6HImM+Ic8xU96ZJ6onXG5NWE3q2iKM+/2AMDfRyCgvY" +
                    "6JQ/y/VCCPu8NB8yDOPVKQnAgFxglfGrDhmm2vOBe5ZrF6mRhjxX1zgFhtyL/Oop8drH0+OxnpYhEWDfcxSY4vuJNVbqdfFQEPz8Xio2lgXEhISEhISEhISEhISEhISEhISEhISEhISEhI" +
                    "SEhISEhISEhISEhISEhISEhISEhISEhISEhISEhIS6lr9F9/JRUeSDVAbAAAAAElFTkSuQmCC","19914",menuBurger))
        foodData.add(Food("Butcher's Burger","South Park in Food Court Madinaty", 4.7f,2134,"11am-10pm",
            "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAk1BMVEWXGyf///+QAACWFiOVEyGSABORAA2TABeVEB+SABCRAAaSABKUCRuRAAWNAACSAA7gxsjNoaTo1NbZuLr37/C9gYXu3" +
                    "+CoTVTcvsDkzc/8+fnUrrH16+yrV1327u+7fIDFkZS1bnOwYmjQp6qlRk2aIy63c3jIl5qdLjfs29zBiIyzam+iPkatXGKpUVjFkpWeMjveqrpgAAAP5klEQVR4nO2d6ZqqPLOGSZgCxjCKTIrzAGh7/ke3M+HU6uruVz+Hzf" +
                    "NjXbYiKzdJKpVKJSpKq1atWrVq1apVq1atWrVq1apVq1atWrVq1apVq1atWrX6/y5sWVh9diEeKVgEQTmH+NnleJRUKwKp66b5yNGfXZbHCMYgIytM6hh4xicyqivgxwCANOjrLvgi5rMLdHeZI9AomuwiUH5cf7RdcFBeDYbp" +
                    "gqBnF+qughE4Vr5YgHzyUYwwB6cKiy8QbaH27ILdTXANzhWWGfBr+Ck+gBF/I6SMngvclf0ZjLi4QEgZgwgEivHs0t1DauciIWUMAZjqnWeX7w6yplcQuZbwA1wAI7yFmJbvz6iiSX++GifXGMOCvLuboyJNVTGZpNcY8+ozXA" +
                    "AMs6ttNdrAj2CE/XMH5yC//xFuDoLedZuT1B/B2J1dr0bg7j7BlUNweR0RxKtPYHTm7g3GYP4B7qoKt9GnMyJSfTwjhhP/FqPyAYwI1sHNeuy+P6Nm2MVVb5UyfoRdxdAs4qv+KmX8BB8AG6TvfQ/mCLmf4ecomg7RIrg8jXRnn" +
                    "+GTs6qE9ehir0y2nzG3otJMaAwvMa4nn7MUAK84dNHiQ5Z0VPWaWQV5D37C0px1Y/oI0mXHefsB0r46NApN1Td35szyNiDgTsA7G1ZyM7Iq5fbflxEvfgBIta7e1bCSW3PGE+U98o6GFQ1+CgiYYUXG23ms8MZM6pKC3Zt1SG33O" +
                    "0DAPdZ38ubsWzP+a4oW7+PpqOgPgFTh0jTewwu46bDdVvYeXoDxD4ftppLB6y+z/sBhu6moBzuv3Vjhxanvb5R6WveVR0j1x/7MDcWzV44FkOK/dMRG6/ELd0hTv74I/gsNR/B1c3RgfY+mCoCHrWejXJNGevdoqiwP6dkoV3Wnp" +
                    "gqS10VUurtbq243FS7L/fP5el2DQ5vq5m/dMYEd01ZkIkT+wpXIVogXf+mOfFsOquVfL03IFt1Gv2ZcCyaSvwWhouidm0mbF5QT/kUZ7Bm+PCGdbMwv5U/f0IAZF7QSf3jvMDFWYf2ryE06g50uko30HQCpNDj4lVl1p00kxHtZr" +
                    "+Zc1Kz+JA7+Ta/rmn4XJuXvh47lOxFSs2r8OoRjP7vMv5Wj/i7SuHwTO3Mk1V7dymc8U/p2Vcikwv6PPfKv96tCLkQmN9KLj6uw++yi/lmIFD8ZOkZvWoVcGH79c+hI38AjvSVd/5dH/tZVyGUoN4eOd69Cptse+UtWIf5tobTrq" +
                    "fAvOBYaUK2mv47FI1JdHjpez53p8LTSPzx4fDm2+npVOP97uczu9903U+feBfy5MELahQU+9F+efMc8jx+vnreGiHvjwWynOARS2YalmyZmGy//E6Gi2KuTYI7/xKECNoUI88h3g8wblePNdofF+4Qi6ybGFPmXlaDC2ZFHvnji8" +
                    "iEEt+TGmbcsF9V2N8cOq+Wu4XQo8uWWfSqNHII5z7QztwmPlaZh5CdxNl2WRbWtVwiSfyDvgznBM08w+DnhBeZhtE7iYLocFdVmNncIR+adGbPOrKgm5MGcwTOTTv4L4XfkMF8nbjD1RsV4MlsppgEJ8UBK/t2m34TwAnLkx9moP" +
                    "5k9D/E/EqbhMM/XfuK6cZBNPW856hWLcbXp17u5omHTcgzHMbVXrkPa8PKIIXCC5agsaQPcDPr1XHNoE+TDKOt8tuFYHV1nwyk1O4gyvUqeEEyHewKBQCuB1sGM80EoESgBM5oUYE/w7JL/WE0lUALLYoYfcwSxheSaK6Ii03nhHK" +
                    "Cf6Sqh2oXWrvoKeu+OeI1Q3fliBvjiK4Gq+i9P8yphsyD/e0JVQ4+ud5OZC9HXaFdDJjSuOxvXWykx/0QIIa7HD3bBrYA6l8dDQRhPrtoSfsFlj1lsofklIYzYf71+7DQKLb7HwoIr/+UtQpFz+ktCwm8YP9gHR6SZex/qsrjcbu5" +
                    "PmP5PzJMu1jQr5owMBGTCKNj4Jv9vDeu2foFQMx3ai03WccWBhBcKiy12SZMQTG9qsPCM1jEcJAkrJO5FLzT0R/RJScjrzejx12toQVjT8Y2V2CawX3hupp8TmqT/FcRx9sV2/h4IVYT3Cc6qjYssjoNRzTZAq5CsqmUcOwqceXFQ" +
                    "IdFKLXGvEbvQW6D798pjQrmdKSGZmKaGULF98dK1TwlRd3lYXOrhhhDD1bjYyh0H+iEyE01sdSUGzZzgRPQ/nd+4S1tAebiXf/dueUzYEXVYElmyHO5P/Dwj7PSPF8+2miQkBb98uGUZQVAcUhiJO4zgSnwlklsXB5g7uhNEn+LRv" +
                    "dxHES66ugHn/P+OoOKQUhIqUOCeEnbG/PXX3Kyn1EaRppXuDfNOUxz+uPIdIfNcEEF+1dqV7cPs8RqVm8KX88kySZtu+QDCoOcF/DyINGMMYk9FxDqF/Z0Q9QWGQb0gMgKB8+3oU7eriamIRgtsVrz5yQaRskZSg8xx2MLUBKt8m1" +
                    "hCVKRD+Ig0Pv00PyT0CnbGFeaEfDA2vhOKpMKSJzNRp3SDGsK0HMiUGoPw55URo0sNDH/Lapr8Eiqdrxlv2TFUsOgaA6Jr9MGW97em+vcMGH+FBKF/mRBVosTCi1VttD++tuoi2ft2wldNgjhZRwJ6rgrCkN2VDiBokOeGuj9TNPdm" +
                    "xLIeMFxIwqykWjZ5Iiv9FqF4JzpuT4JwSCiwWN6ovy9UNAcVZ82CBYL8FoejC8Js9oBzbpoR36ZzdV3aGuCSW4QC5yQD/ajsIghSi4flBgdheVV5ltfd+TpuP/O7bxeShGNhwswJ/yu9TQj2H54SLlnZhadSi2Nsamg0spqrvjmF8" +
                    "DhvI7x7Oz0lVMQ0CBgHQnHK93fC8Dvh6EDYF4Sntv8KoYLJ5JBHNb23n3qRMD2Mh7JYJ4Ri89r2qPTioq8D4UA4DYdFQmoprxIaGrKdQkJG9x4vTgmxMJO+IATdveXYEyqqHCGpcyKsgkmdNNlK9T3hRNwglZZDJVPq51whRMlMYw" +
                    "k46nr/WB9ByNsGkla/B8UgNSJYzq4ooVg/nNiWIXfjJ7qBcYf0wAYfzS0E4dgQ16wt28QmnPvMPxOEvTNLQ50mj3tK5oZ9fPf5oiR0dx02fcplF0PC4oCskC4qJZTdr+eBgfTO0qwoPPaVOeENd8p8AMgJi/2pkkFvUfIG2BCe2VJ" +
                    "zTJvDjBiOTfht771mg8k+qSfdW7RaU7qH2IbohwQfjt0Pz879KImoOJdNkmAomuLZqQTpzLTEVUtyXEuyF+RxII5Ky+7cSHH5PRMkmdNyNpVIW6rwTvLSaN7K5wgfTQfyPpnK5zGkMwVBuIC06x3d1MWo00QTwuOGiE7TGL/IfQEV0" +
                    "xvm+TAM0zAc5lHku1kpj8/TRaZPUsNZ5FNFS9MZs8Knnk3tArXvgsovIHLitc8VVQ1h5M0VY5fJVh/MIIt6yavWJzMkRPpT2TrCbHX/xH0Tnsg+/FIQgvPBFkFN0cRHJjN3u8nMFqnnyIar7abu8O28TvN9dFjY6WuKakF1W21WUJ" +
                    "z8YTVXndkSrQMteq/tHP6vj15S0TcP6uQtVft+AZXucMnCagj9pNjsXu+zsvMW0m2hLpfxwnsg/yg9S1zXTRq5JX73VaVz6d55lvZTcyceIV0Mzmk4lKipsH+q1kRDVdRYXQ0j/re0KPSDc6OBTPOoDYhb0OsfzPAPCd9rQiCR5yN" +
                    "OEKJjAp4VW01hyVCralGrit6FnXpRIQ2uJoOdykaf+WRc9edsFLJ598VQqXq9SuFBVHH9RtPgbly9AiGbcaiYEy6sKuDRYdoni8xP+SvdS9iYnhE+4Y2gCvc+Upr7Lp0Rq3Asj3T1N1CR13uQX588NcP0QCiH8FmzaYtySfer17iq" +
                    "UxE5LHXl1AekyMK9y8UaDGyCbX35/ecTVib1aJrQqS4mUiVWLB7qZCWEiJVZuqVYTI17RJzkHkCoaqzWozkh/AfPxhhajNhLedj0ufZZEPY0dcb95zWd+Cr6UhIqIhTH6kDOICJHodPmpagpReOTqRSKX5BKO5oMsbJVAtGrhwMSPjPDd" +
                    "E/Y9Kmlxg4HNAWh2YTEGWFXEK4Q3vbF3myW+9vhLXri8FDolDAl4jNbXE/taV0/10s7IQTsx7ug/G09RojPCLMuHQQ0vlrGd6KLKO+SnJ8bvUGCMIYsM+KpgJLQK4qiJ3vZsiNq7hKh8AfEd/iyB38WI/sMkE6tBeH4BVwkUdqNg7FpSAto8sUiHjI8b6UiK13EHSf0c9EmZ2Lu3Jv1pWZIEYTzF5hGyBGf1w0Sg8FErJexkKGwOQdCUSUaHwSGc0j42Z8+2Yrv6ZoU5RKEr7Dh6ZhQcXhJC1v0Ll1RjOCUUM49DBGf93md50gTa077vTF7wvTeoYq/6JhQHgS5sXjVZEazvHZeh/Rbh4NbPajKm8hTMBSz3jWt9NUIZTjOEAfPpgQbG3BK2HxLVWgNZnHgVfyMK0s4P1NiIs0kY5DOpKV5hQ1BYm7RY7mkRLhrI10T/Wo9kWfSHAgby8FOVJzx4a/D5xsiUQxEo0G/ZCPHGHW5NXqBqViHyPEwX/viVUCaUCjvauyfBVGwGOUH8jh9VvOB669915uweJO5j0mKnmzI65WnH7+vT88G/LTHzN/+cN1YeOO51vwmZMgXmU5/IpJtqdC3h6l0VFtyRZtev3kyorl041jEMfwkcbOxmOpRY+GmIPUrosRMrjIOMq6A91jZjPcVDVlMskhCNpcKBlBTUBGL1dJ48OxzE022pskDUbDbtQ+r65oNsc3msmLVU0GWlBg4YXWCyF0der2JDeiIK5r10mcD/k24KskmyHqTsScdvWYkfAEX5j6iDZPOAE2EnaNV7w8SYsNlKhIaxQizfbbFvIOwpdKOJrqpSG5KSwyhSHJ88hT3Z/pH1gBeBDNYRjKRyZCLormI1iQvmLlPbSc0oa1gttJkQ4jUjHmQhqU4uNOFGEHUgUrXMUzdgJrWhWQE+mMwlg66Ao+Obg2LF6xB0/fXUTlMSBFFpbIOo1XCcj8sNyNuMY2ixSCfZLkdBcnXMgm39TqKa1D7oNwnXJhwEazzPPKnm5c8gr2bpCuQ9MACTANABvPc9UJahw79Y5gBUoINqBaA+LTSQG8D02gJKjDzwPFyoNw523lNG2NlCQmXOgjAYjNAkRv5X2wmp9WgWsc5UcEYVAUgsUvYT82WYNTv70C/vHsCzONk+yEBUxMsgVt5PVCkYcGTX6APFiXYTYEF1kNgrnOy8WrwlYbLrAJVBt7mSDkFe9P+dImySZXENZ5mvdjOCqSoxgRAu+cGtVEmRbydZrtFEHtOHbuDSTZZZk8OC/5Gpq7qpqIjbNBhTtdNh75W1Lo3pfaGvqdRdxU7mq6ryKIDu+YYGrKQab0P4GWhSZ69wpz8gUIvfOp2q1atWrVq1apVq1atWrVq1apVq1atWrVq1apVq1atWrX6CP0fo2MboegGwnIAAAAASUVORK5CYII="
                    ,"01278841635",menuBurger))
        foodData.add(Food("The Burger Factory","114 26th Of July St., Intersection Of Hassan Sabry St. Zamalek", 4.7f,1218,"11am-10pm",
            "https://i.pinimg.com/originals/e5/26/26/e52626e6ca2699f813b23c13a7a5e669.png","010017159085",menuBurger))
        foodData.add(Food("McDonald's","7/1 El Nasr Street, New Maadi New Maadi", 4.9f,6998,"11am-10pm",
            "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBw0NDQ0NDg0NDQ4NDQ0ODg0NDQ8NDg0NFREWGBURExMYHSogGBolGxYTITEhJSkrLi4uFyE/" +
                    "RDM4Nyg5LjcBCgoKDg0OGxAQFy0iHR4sNy0wLysrLS0tLS43KzcrLS4tLS0tLS8tLSsuLS0wLS0tLS0tListLS0vKy03Li0tLf/AABEIAK4BIgMBEQACEQEDEQH/xAAbAAEAAgMBAQAAAAAAAAAAAAAABgcBBAUCA//" +
                    "EAEYQAAIBAwAECwEMBgsAAAAAAAABAgMEEQYSEyEFIjFBUVJhcYGRocEHFDJTcnOCkqKxs8IjJGJkdLIVJTM0QmODo8PR0v/EABsBAQADAQEBAQAAAAAAAAAAAAABBQYEAwIH/8QANBEBAAECAwUHAgYBBQAAAAAAAAEC" +
                    "AwQFERIhUXGxEzFBYYHB4TPwIiQ0kdHxMiNCUnKh/9oADAMBAAIRAxEAPwCKGbfqwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACAAEgQBI" +
                    "ACAJAAQAAAAAACQAAAAAAAAAAAAAAAAAAAAAAAAAAgAAAAAAAAAAAAAAAAAkAAAAAAAAAAAAAAAAAAAAAAAAgABIAABAAAAAAAAAAAAAAAAABIAAAAAAAAAAAAAAAAAAAQAAkAAAgAAAlux4Iu3HXVrX1eXOylnHdynhOJsx" +
                    "Om3GvN4TibMTptxrzaT6ORrc09zT6Ge72AABhLdp8E3c468bau44zlU5b12LlfgeM4mzE6TXGvN4TibMTpNca82nKLTaaaaeGmmmn0NHtE674e0TrGsMAAAAAEgAAAAAAAAAAAAAAAAAAAAgCQAACAABO9E9H40oRua0c1ppShG" +
                    "S/sYvkeOs/QocfjZrmbdE/hjv8/hRY/GTXM26J/DHf5/D7VdL7SNd0sVHBS1XXSTpp9KWctdp8U5Zdm3tbteHi+KctuzRtbteHi+mkfAMLuDq0lFXCjmMljFZY+DJ8/Y/YfODxlVmrZq/wAej5weMqs1bNX+PRXbTTaaaabTTWG" +
                    "muZo0bRMATfRLR6MIxuq8M1JYlSpyW6nHmk11n6d5R4/GzVM27c7vGePwpMfjZqmbdE7vHz+G5e6W21Gu6OKk1GWrUqQScYPn58vHPg8bWW3a6NvdHCHjby67XRt7o4Q98P8AAtK+pKrTcdtqKVKquSpHGVGT50+Z8x84XFVY" +
                    "evZq/wAfGOD5wuKqw9ezV3eMcFdSi4txknGUW009zUk8NM0cTExrDRxMTGsMEgAABIAAAAAAAAAAAAAAAAAAAAIAkAAAgA7OinBvvm6jrLNOj+lnnkbT4sfF+iZxY+/2VqdO+d0e7jx1/srW7vndHumGlt+7ezm4vE6rVKDXK" +
                    "tbOs19FS9CnwFntL0a90b/v1U+As9pejXujf9+qtjStIsDQi/dW2dKTzK3korp2T3x8uMvAz+Z2di7tR3VdfFn8ys7F3ajuq6+LiaccG7KvG4isQr5U8cirLlfit/gztyy/t0dnPfT0+Hdll/bo7Oe+np8NHRfg1XV1GMlml" +
                    "TW0qJ8jSe6L736JnRjb/Y2pmO+d0PfG3+xtTMd87oTjSS/dtaVakXicsU6b51OXOu5ZfgUWDs9reime7vnko8HZ7W9FM93fPJWBqGoTvQO+c6E7eTy6Ek4fNSzu8GpeaKHNLOzciuP93VQ5pZ2bkVx/u6uXp1wbs60bmKxG" +
                    "vxZ9lVLl8UvsvpOrLL+1RNue+nu5fHu6ssv7VE2576e7l8e6MFoswAACQAAAAAAAAAAAAAAAAAAAAQBIAABABYWhNlsrTaNca4k5/QW6K+9/SM9mV3bvbPhTu/ln8yu7d7Z8Kd38uPp/c5rUKPNTpyqNftTeF6R9Tsyq3pR" +
                    "VXxnT9v7deVUaUVV8Z0/b+0VLVapBoRc7O9UM7q9OcMftLjL0UvMr8zt7VjX/AIz8K/Mre1Z1/wCM/CX6SWXvizrQSzKMdpDp1470l3714lPg7vZXqZ8O6fVUYO72d6mfDuloaD2WztNq1xriTl27OO6K/mf0jozO7tXtnw" +
                    "p6+L3zO7tXdnwp6+Lm+6Dc8a3oJ8ilVku18WP3TOnKbe6qv0959nTlVvdVX6e8+yIlut3b0NudnfU1zVozpPy1l6xXmcOY29qxM8N/t7uLMaNqxM8N/t7ptpDZe+LStTSzJR14fLjvXnjHiUmEu9lepq8O6eSkwl3sr1NXh4" +
                    "8lXI1LUgQAAASAAAAAAAAAAAAAAAAAAAEASAAAQ9Qpucowj8KclGPym8L1ImYpjWe6CZimNZ7oW5b0Y0qcKcfg04RhHuisIyFdU11TVPiyFdU1VTVPirbSmttL+4ecqMo012KMUmvPJpcDTs4enz3tLgaNmxT573KOt1Nrgq" +
                    "vsrm3qcmpWpt/J1kn6Nnlfo27VVPGJeV+jbtVU8YlbBkmTeKFKNOEacFqxhFRilzRSwkfVVU1TNU98vqqqapmqe+Vc6X19e/rdFNU6a8Ipv1bNHl9Gzh6fPe0eX0bOHp897jHa7H2sq+yrUqvxdWnN9ykm/Q+LlG3RNPGNHxc" +
                    "o26Jp4wtwyDIqp4ZtdhdXFJblCrLVXRB8aPo0azD3O0tU1cY+Grw9ztLVNXGPhpns9gAEgAAAAAAAAAAAAAAAAAAAAgCQAACHV0Wt9rfW6xlRk6j+hFtPz1Tkx1exYqnju/dy46vZsVTx3fus0zDMKiu6u0q1anxlWpP60m/aa" +
                    "+3Ts0RTwiGvt07NEU8IiHyPt9MS5H3CEwt+2qa9OnPrwhLzSZkK6dmqY4SyFdOzVMcJfQ+HwqbhOrtLm4ny61eq13a7x6YNbZp2bdMcIjo1tmnZt0x5R0ax6vRhrcEra4NrbS3oVOvRpS8XFMyV6nZuVU8JnqyV6nZuVU8JlCt" +
                    "PKGrdwqc1WjHxlFtP01S7yuvWzNPCfv3XeV162Zp4T9+6NlksQAEgAAAAAAAAAAAAAAAAAAAAgCQAACEn0Bo5ua1T4ujq+MpL/wAsq81q0tU08Z6R8qzNatLVNPGen9ptd1NSlVn1Kc5eUWykt07VcRxlSW6dqqI4yqGPIu42Et" +
                    "fLJCAC0dHZ61jav/Ipx+qsewy2MjS/XzZfFxpfr5t+pLVi5dVN+SOeI1nRzxGs6Kei8pN8+82MtiyEAFm6LVNawtn0QcPqycfYZjHU6Yirn8szjqdMRVz+XH90GjmnbVOrUnT8JRz+Q7Mpq/FVT5a/f7uzKavxVU+Wv3+6FF2ug" +
                    "AEgAAAAAAAAAAAAAAAAAABAACQAACE09z2nxLmfTOnD6sW/zFLm1X4qKfKfv/xS5tV+Kmny++jv6QSxZXb/AHeqvOLXtK/CRrfo5w4MLGt+jnCrDVNSAALJ0Onng+h2OqvKrIzWYRpiKvTpDN5hGmIq9Ojf4VqaltcS6tCs/KDOex" +
                    "Gt2mPOOrnsRrdpjzjqqdGta0CACxNCZ5sILq1Ky+237TO5lGmInlHRncyjTETyjoxpxT1rGT6lWlLzer+YZZVpfiOMT/PsnLatL8Rxif5V4aJogIAkAAAAAAAAAAAAAAAAAAAIAkAAAAQn2gUMWk5de4m/BQgvYygzWdb0Rwj3lQZp" +
                    "Ot6I4R7y39KpYsLnthFec4r2nPgY1xFPP2eGBjXEU8/ZWRp2mAAFiaESzYQ7KtZfaz7TO5nH5ieUM9mUfmJ5R0b2kLxZXf8AD1V5xaPDCfXo5w58J9ejnCrTUtSAAJ7oDLNpUXVuZpdzhB/9lBmsf60cveVDmsf60cveXQ0qhrWFy" +
                    "uiCl9WSfsOfAzpiKefs58DOmIp5qyNO0wACQAAAAAAAAAAAAAAAAAAAgCQAAABCxdCY4sKfbUrP7bXsM5mU/mJ5R0Z3Mp/MTyjo96ZP+r6/fRX+7EjLv1FPr0lGXfqKfXpKtzSNGAALB0Ff6l/r1fuiZ7NPr+kM/mf1/SG9pM/1G6" +
                    "+ZkeGC/UUc3hg/r0c1YGoacAATr3P3+rV1+8f8cSizb6lPL3lR5r9Snl7y7PD6zZXf8PVflFs4sJ9ejnHVxYX69HOOqroQlJ4jGUnjOIxcnjpwjUzMR3y1EzEd86PJKQJAAAAAAAAAAAAAAAAAAACAAEgAAELG0Na/o+jvXwq34sj" +
                    "N5j+oq9OjOZj+oq9OhpnJe8Ku/wDxUfxIk5dH5iPXonLo/MR69FcmjaIAAdGw4buraGzo1dSGs5Y2dOXGfK8tdiOe7hLV2rarjWecue7hLV2rarjWecvd1pDe1qc6VStrQmtWUdnTWV3pZPmjBWKKoqpp3x5y+aMFZoqiqmnfHnL" +
                    "lnU6gABN/c/f6C4+eX8iKPNvqU8vdSZr9Snl7u7w217zu96/u1f8ADkcGG+tR/wBo6uDDfWo/7R1QfgecdmuLKSWdpGnDaTVR1oYm46rytnnDxzSxvZe4iJ2uHDWdN2k7tdY8fZeYiJ2uHDXdu0ndrrHj7OfwrJOqvgueolVcW5La" +
                    "Ze7WfK1HUTfSnznRYjSny13cv719HRYjSny13cv71aZ7PYCQAAAAAAAAAAAAAAAAABAEgAAAAw4roROpqKK6ENTVkhAAAAAAAABhpPmGqdTVXQvInWTWWWuwgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAEgAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAgCQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAA//Z","19991",menuBurger))
        foodData.add(Food("Hardee's","8 /2 El Nasr Street, New Maadi New Maadi", 3.5f,2265,"11am-10pm",
            "https://www.hotlinesegypt.com/wp-content/uploads/2019/02/Hardee%E2%80%99s19066.jpg","19066",menuBurger))


    }


}